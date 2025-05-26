// AI HAS PROVIDED ME WITH THIS README FILE
📖 Introduction
History is a difficult subject to learn. 
This app called "KNOW THE PAST" has been created to help students with history.
The learning app is a simple Android application built with Kotlin in Android Studio.
It allows users to take a short true/false questions, receive feedback on their answers, and view their final score.
The app includes a welcome screen, a question screen, and a score/review screen.

🚀 Features
	• Welcome screen with a start button and description.
  • True/False question screen with immediate feedback.
	• Score screen showing total correct answers.
	• Personalized messages based on performance.
	• Review screen to view questions and correct answers.
	• Exit functionality to close the app.
 
🖼️ Application Screens
1. Welcome Screen
• Displays a brief description and a 'Start' button to begin the quiz.
2. Flashcard Question Screen
• Displays one True/False question at a time.
• True and False buttons are disabled after selection.
• Feedback (Correct/Incorrect) is shown.
• Next button loads the following question.
3. Score Screen
• Displays the user's score out of 5.
• Provides personalized feedback:
   - 'Great job!' for scores 3 or higher.
   - 'Keep practising!' for scores less than 3.
• Includes a Review button and an Exit button.

📝 Sample Questions
1. World War II began in 1939.-TRUE
2. The United States joined the war after the attack on Pearl Harbor.-TRUE
3. Adolf Hitler was the leader of Italy during World War II.-FALSE
4. The atomic bomb was dropped on Berlin.-FALSE
5. The Allies won World War II.-TRUE

🧠 Application Logic Overview
Welcome Screen Logic
• Clicking 'Start' navigates to the Flashcard Question screen.
Flashcard Question Logic
• Two arrays store the questions and answers.
• Score is initialized to zero.
• Loop displays each question and processes the selected answer.
• Answer buttons are disabled after selection.
• Feedback is shown, and the score is updated accordingly.
Score Screen Logic
• After the final question, the score is displayed.
• Personalized feedback is shown based on score.
• Review button shows questions with correct answers.
• Exit button terminates the app.

📁 Project Structure
	• MainActivity.kt - Welcome screen
	• questionPage.kt - Question logic and UI
	• ScorePage.kt - Final score and review
	• activity_main.xml - Layout for Welcome screen
	• activity_question_page.xml - Layout for Quiz screen
  • activity_score_page.xml - Layout for Score/Review screen
  
🔄 Version Control with GitHub
To push your project to GitHub, follow these steps:
1. VCS
2. Share on github
3. Commit and push when changes made
   
📌 Requirements
	• Android Studio 
  • GitHub
  • BlueStacks

👤 Author
Your Name - HAYLEE GOVENDER

📄 License
This project is intended for educational use only.


