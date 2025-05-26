package com.example.studyapp

import android.content.ContentValues.TAG
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView
import android.content.Intent
import android.util.Log


class questionPage : AppCompatActivity() {

    // ai assisted code

    // Array of questions and answers
    private val questions = arrayOf(
        " World War II began in 1939.",
       "  The United States joined the war after the attack on Pearl Harbor.",
        " Adolf Hitler was the leader of Italy during World War II.",
       " The atomic bomb was dropped on Berlin.",
        " The Allies won World War II."
    )
     private val answers = arrayOf(true, true, false, false, true)

    // variables to keep track of the score and current question index
    private var index = 0
    private var score = 0


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Find the elements from the layout by its ID
        val tvQuestion: TextView = findViewById(R.id.tvTrueFalse)
        val btnTrue: Button = findViewById(R.id.btnTrue)
        val btnFalse: Button = findViewById(R.id.btnFalse)
        val btnNext: Button = findViewById(R.id.btnNext)
        val tvFeedback: TextView = findViewById(R.id.tvResponse)

        //Function for questions
        fun loadQuestion() {
            if (index in questions.indices) {
                tvQuestion.text = questions[index]
                tvFeedback.text = ""
                btnTrue.isEnabled = true
                btnFalse.isEnabled = true
            }
        }
        loadQuestion()

        // Button true clicked
        btnTrue.setOnClickListener {
            //Checking input
            Log.d(TAG, "True button clicked")
            checkAnswer(true, tvFeedback)
            btnTrue.isEnabled = false
            btnFalse.isEnabled = false
        }

        // Button false clicked
        btnFalse.setOnClickListener {
            //Checking input
            Log.d(TAG, "False button clicked")
            checkAnswer(false, tvFeedback)
            btnTrue.isEnabled = false
            btnFalse.isEnabled = false
        }
        // Button next clicked
        btnNext.setOnClickListener {
            Log.d(TAG, "Next button clicked")
            //IF statement used to go to the next question and end test once done
            if (index < questions.size - 1) {
                //Increasing index
                index++
                loadQuestion()
                btnTrue.isEnabled = true
                btnFalse.isEnabled = true
            } else {
                // Once done goes to score screen
                val intent = Intent(this, ScorePage::class.java)
                intent.putExtra("score", score)
                startActivity(intent)
                finish()
            }
        }
    }

    // function to check answer and output whether it is incorrect or correct
    private fun checkAnswer(userAnswer: Boolean, tvFeedback: TextView) {
            if (userAnswer == answers[index]) {
                tvFeedback.text = "Correct!"
                score++
            } else {
                tvFeedback.text = "Incorrect"
            }
    }

}


