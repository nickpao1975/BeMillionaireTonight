import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

// handles the game's logic - Level 1
public class Game1 {

     // Hello git test - David
    // changing test with GIT via intelliJ
    // test again with intelliJ
    private QuestionRepositoryLevel1 questionsL1 = new QuestionRepositoryLevel1();     //define an instance variable of question repository L1


   private ArrayList<Integer> askedQuestionsLevel1 = new ArrayList<>();              //define an array for the 5 asked question

   private boolean userWon1;
   private int[] prizesLevel1 = {100,200,300,500,1000};
   private int prizeWon1;

    public void askingNextQuestionLevel1(){                                      //it's the main method here
        Scanner answerContinue = new Scanner(System.in);
        boolean isCorrect = true;
        userWon1 = true;
        int counter = 0;
        int counterQuestion = 1;

         do {
             if (askedQuestionsLevel1.size() < 4) {
                 int randomNumber = askingQuestionLevel1(counterQuestion);
                 String userAnswer = answerQuestionLevel1();
                 isCorrect = checkingAnswersLevel1(userAnswer, randomNumber);

                 if (isCorrect) {
                     prizeWon1 = prizesLevel1[counter];

                     System.out.printf("You won %,d €.\n", prizeWon1);
                     System.out.printf("You can win %,d € with the next question.\n", prizesLevel1[counter+1] );
                     System.out.printf("Do you want to continue playing?\nYes / No\n");
                     String doContinue = answerContinue.next();

                     while (!doContinue.equals("Yes") && !doContinue.equals("No")){                  //checking the user typing the correct form of Yes/No and handle the answer
                         System.out.printf("Do you want to continue playing?\nYes / No\n");
                         doContinue = answerContinue.next();
                     }
                     if (doContinue.equals("No")) {
                         System.out.println("You finished the Game");
                         System.out.printf("~°~°~°~° You won %,d €. ~°~°~°~°\n", prizeWon1);
                         userWon1 = false;
                         break;
                     }
                     

                 } else {
                     userWon1 = false;
                 }
             } else {                                                                                           //it's for the last question, it's the same without asking the "continue question"
                 int randomNumber = askingQuestionLevel1(counterQuestion);
                 String userAnswer = answerQuestionLevel1();
                 isCorrect = checkingAnswersLevel1(userAnswer, randomNumber);

                 if (isCorrect) {

                 } else {
                     userWon1 = false;
                 }
             }
             counter++;
             counterQuestion++;
         } while (isCorrect && askedQuestionsLevel1.size() < 5);

     }

     public Integer askingQuestionLevel1(int counter){               //ask a question and print the optional answers

        int randomNumber = ThreadLocalRandom.current().nextInt(0, 15);

         while (askedQuestionsLevel1.contains(randomNumber)){                            //checking that the question have been asked
             randomNumber = ThreadLocalRandom.current().nextInt(0,15);
         }

         System.out.println();
         System.out.println(counter + ". " + questionsL1.getQuestionsLevel1().get(randomNumber).getQuestion()); //asking the question
         questionsL1.getQuestionsLevel1().get(randomNumber).printAnswers();
         askedQuestionsLevel1.add(randomNumber);
         return randomNumber;
     }
     public String answerQuestionLevel1(){                                 //handle the user answer
         Scanner answer = new Scanner(System.in);
         System.out.println("Please, give an answer: ");
         String userAnswer = answer.next().toUpperCase();
         return userAnswer;
     }

     public Boolean checkingAnswersLevel1(String userAnswer, int randomNumber){                             //checking that the answers was correct or not
         int index = 0;
         int indexCorrectAnswer = questionsL1.getQuestionsLevel1().get(randomNumber).getCorrectAnswer();

         switch (userAnswer) {                                                     //converting the answer to number (this will be the index of the array)
             case "A":
                 index = 0;
                 break;
             case "B":
                 index = 1;
                 break;
             case "C":
                 index = 2;
                 break;
             case "D":
                 index = 3;
                 break;
         }

         boolean isCorrect = true;

         if (index == questionsL1.getQuestionsLevel1().get(randomNumber).getCorrectAnswer()) {       //it checks is the answer is correct
             isCorrect = true;
         } else {
             System.out.print("Sorry, it was the wrong answer. The correct answer was:   ");
             questionsL1.getQuestionsLevel1().get(randomNumber).printCorrectAnswer();
             System.out.println("You lose all your money! Better luck next time!");
             isCorrect = false;
         }
         return isCorrect;
     }

    public boolean isUserWon1( ) {
        return userWon1;
    }

}
