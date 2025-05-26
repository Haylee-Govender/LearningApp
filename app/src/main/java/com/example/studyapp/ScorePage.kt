package com.example.studyapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.Button



class ScorePage : AppCompatActivity() {

    // Array of questions and answers
    private val questions = arrayOf(
        " World War II began in 1939.",
        "  The United States joined the war after the attack on Pearl Harbor.",
        " Adolf Hitler was the leader of Italy during World War II.",
        " The atomic bomb was dropped on Berlin.",
        " The Allies won World War II."
    )
    private val answers = arrayOf(true, true, false, false, true)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_score_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Receiving the score
        val score = intent.getIntExtra("score", 0)
        // Find the elements from the layout by its ID
        val tvTotal: TextView = findViewById(R.id.tvTotal)
        val tvFeedback: TextView = findViewById(R.id.tvFeedback)
        val btnReview: Button = findViewById(R.id.btnReview)
        val btnExit: Button = findViewById(R.id.btnExit)
        val tvReview: TextView = findViewById(R.id.tvReview)

        // Displaying details
        tvTotal.text = "Total number of correct answers : $score / 5"
        tvFeedback.text = if (score >= 3) "Feedback : Great job!" else "Feedback : Keep practising!"

        // ai assisted code
        // Review button clicked
        btnReview.setOnClickListener {
            val builder = StringBuilder()
            // Loop through all questions using their indices
            for (i in questions.indices) {
                // Convert boolean answer to readable text
                val answerText = if (answers[i]) "True" else "False"
                // Append question number, question text, and answer to the builder
                builder.append("${i + 1}. ${questions[i]} - $answerText\n")
            }
            // Set the complete string as the TextView text
            tvReview.text = builder.toString()
        }

        // Exit button clicked
        btnExit.setOnClickListener {
            //Closes entire app
            finishAffinity()
        }
    }
}

