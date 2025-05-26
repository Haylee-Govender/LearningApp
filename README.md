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



// AI ASSISTED 
PROJECT REPORT 

1. Introduction
   
The Learning App is a mobile application developed using Kotlin in Android Studio.
It is designed to offer a simple experience using true/false questions.
The app aims to enhance users' general knowledge and learning through a series of true/false questions.
This report outlines the design, development, implementation, and features of the learning App.

2. Objectives

• Develop a functional and user-friendly quiz application.

• Provide immediate feedback to the user based on their answers.

• Keep track of the score and present it at the end of the quiz.

• Offer users the ability to review their answers.

• Ensure smooth navigation between screens and logical flow.

3. Tools and Technologies Used

• Programming Language: Kotlin

• Development Environment: Android Studio

• Minimum SDK: Android 5.0 (API 21)

• Layout Files: XML for UI design

4. System Design and Architecture
   
4.1 Activities Overview

• MainActivity: Displays a welcome screen with a description and a 'Start' button.

• questionPage: Handles question presentation, answer selection, feedback, and score calculation.

• scorePage: Displays the final score and gives options to review or exit.

4.2 Data Flow

• The app starts in MainActivity.

• Clicking 'Start' transitions to questionPage.

• Questions and answers are stored in arrays.

• User selections are processed and score is calculated.

• After the last question, the score and data are passed to scorePage.

• User can review their performance or exit the application.

5. Implementation Details
   
5.1 Question and Answer Logic

Questions are stored as an array of strings and their corresponding answers as a boolean array.
User selections are checked against the correct answers and feedback is displayed immediately.

5.2 Disabling Buttons

Once a user selects either 'True' or 'False', both buttons are disabled to prevent answer changes.
This ensures each question can only be answered once.

5.3 Score Calculation

A score variable keeps track of the number of correct answers.
At the end of all questions, this score is displayed with a performance message.

5.4 Review Feature

The review option on the score screen allows users to see all the questions along with the correct answers, helping them learn from any mistakes.

6. Screenshots
   
Screenshots of the application can be added here for each screen: Welcome, Questions, Score.

7. Testing and Evaluation
   
The application was tested on an Android emulator and physical device. 
It successfully handled transitions between activities, user inputs, score calculation, and review functionality
No major bugs were found, and the app performs reliably with a responsive UI.

8. Conclusion
    
The learning App meets its objective of providing a simple and educational quiz experience.
Through the use of Kotlin and Android Studio, the application demonstrates fundamental mobile development practices, UI management, and user interaction handling.

9. Future Enhancements
    
• Add more questions and categories.

• Implement a timer for each question.

• Include a high-score tracker.

• Add animations and sound effects for feedback.

• Store user progress using local storage or a database

10. Author Information
    
Developed by: HAYLEE GOVENDER

![1](https://github.com/user-attachments/assets/cf1c1b1d-83da-4566-9cdf-fd457fe5ea14)

![2](https://github.com/user-attachments/assets/bdd87990-d693-4268-9b4f-03e54b60d2f0)

![3](https://github.com/user-attachments/assets/b6f33295-f186-4e71-afb0-5666128f03fd)

![4](https://github.com/user-attachments/assets/66440cb3-c38f-43fe-88d7-ac7e1f0a4611)

![5](https://github.com/user-attachments/assets/743484a4-6a2a-4b71-b8c2-fba40b125579)

![6](https://github.com/user-attachments/assets/9508aa49-43cb-477c-9754-007bfa163d10)

![7](https://github.com/user-attachments/assets/e3f65d0c-6ebe-4e47-9a4a-b20851eb6707)

![8](https://github.com/user-attachments/assets/83b10c99-f669-4445-988b-a39c220db750)

![9](https://github.com/user-attachments/assets/4b9c1987-6186-4f5c-ba68-3f73e5d3c9c6)

![10](https://github.com/user-attachments/assets/672a575c-7b39-4cf1-a5e4-dcf9ade38cdc)

![11](https://github.com/user-attachments/assets/e061e032-92a8-4505-8bc8-8323bce440a4)

YouTube link: 






















