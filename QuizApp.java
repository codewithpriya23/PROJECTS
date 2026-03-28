 import java.util.Scanner;
 public class QuizApp {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Welcome to Quiz!/n");
         String[] questions = {
                 "1. What is 2+2?/nA.3  B.4  C.5  D.6",
                 "2. What is the capital of India?/nA.Delhi  B.Mumbai  C.Kolkata  D.Chennai",
                 "3. Which is a programming language?/nA.Python  B.Eagle  C.Tiger  D.Snake",
                 "4. Java is ...?/nA.Plant  B.Language  C.Car  D.Song",
                 "5.  5*5 = ?/nA.20  B.25  C.30. D.15",
                 "6. What is the color of apple?/nA.Red  B.Green  C.Black  D.Blue."
         };
         char[] answers = {'B', 'A', 'A', 'B', 'B' ,'A'};
         String[] hints = {
                 "It is the only even number between 3 and 5.",
                 "It is also called National Capital.",
                 "It is also a snake,but here programming language.",
                 "It is a widely used programming language,",
                 "It is 5 multiplied by itself.",
                 "Apple is red.",
         };
         int score = 0;
         int highScore = 0;
         for (int i = 0; i < questions.length; i++) {
             System.out.println(questions[i]);
             System.out.println("Do you want a hint? (Y/N): ");
             char hintChoice = sc.next().toUpperCase().charAt(0);
             if (hintChoice == 'Y') {
                 System.out.println("Hint: " + hints[i]);
             }
             System.out.println("Enter your option (A/B/C/D/E): ");
             char userAns = sc.next().toUpperCase().charAt(0);
             if (userAns == answers[i]) {
                 System.out.println("Correct!/n");
                 score++;
             } else {
                 System.out.println("Wrong! Correct answer is " + answers[i] + "/n");
             }
         }
         System.out.println("Quiz Over! Your score :" + score + "/" + questions.length);
         if (score > highScore) {
             highScore = score;
             System.out.println("Congratulations! New High Score: " + highScore);
         } else {
             System.out.println("High Score: " + highScore);
         }
         System.out.println("Thanks for Playing ! See you next time.");
         sc.close();
     }
 }


