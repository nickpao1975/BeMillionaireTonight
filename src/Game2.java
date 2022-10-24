import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
// handles the game's logic - Level 2 - It's tha same as Level 1
public class Game2 {

    private QuestionRepositoryLevel2 questionsL2 = new QuestionRepositoryLevel2();
    private ArrayList<Integer> askedQuestionsLevel2 = new ArrayList<>();
    private boolean userWon2;
    private int[] prizesLevel2 = {2000, 4000, 8000, 16000,32000};
    private int prizeWon2;
    public void askingNextQuestionLevel2(){
        Scanner answerContinue = new Scanner(System.in);
        boolean isCorrect = true;
        userWon2 = true;
        int counter = 0;
        int counterQuestion = 6;

        do {
            if (askedQuestionsLevel2.size() < 4){
                int randomNumber = askingQuestionLevel2(counterQuestion);
                String userAnswer = answerQuestionLevel2();
                isCorrect = checkingAnswersLevel2(userAnswer, randomNumber);

                if (isCorrect) {
                    prizeWon2 = prizesLevel2[counter];

                    System.out.printf("You won %,d €.\n", prizeWon2);
                    System.out.printf("You can win %,d € with the next question.\n", prizesLevel2[counter+1] );
                    System.out.printf("Do you want to continue playing?\nYes / No\n");
                    String doContinue = answerContinue.next();

                    while (!doContinue.equals("Yes") && !doContinue.equals("No")){
                        System.out.printf("Do you want to continue playing?\nYes / No\n");
                        doContinue = answerContinue.next();
                    }
                    if (doContinue.equals("No")) {
                        System.out.println("You finished the Game");
                        System.out.printf("~°~°~°~° You won %,d €. ~°~°~°~°\n", prizeWon2);
                        userWon2 = false;
                        break;
                    }

                } else {
                    userWon2 = false;
                }
            }  else {
                    int randomNumber = askingQuestionLevel2(counterQuestion);
                    String userAnswer = answerQuestionLevel2();
                    isCorrect = checkingAnswersLevel2(userAnswer, randomNumber);

                    if (isCorrect) {

                    }   else {
                        userWon2 = false;
                    }
                }
            counter++;
            counterQuestion++;
        } while (isCorrect && askedQuestionsLevel2.size() < 5);
    }

    public Integer askingQuestionLevel2(int counter){

        int randomNumber = ThreadLocalRandom.current().nextInt(0, 15);

        while (askedQuestionsLevel2.contains(randomNumber)){                            //checking that the question have been asked
            randomNumber = ThreadLocalRandom.current().nextInt(0,15);
        }

        System.out.println();
        System.out.println(counter + ". " + questionsL2.getQuestionsLevel2().get(randomNumber).getQuestion()); //asking the question
        questionsL2.getQuestionsLevel2().get(randomNumber).printAnswers();
        askedQuestionsLevel2.add(randomNumber);
        return randomNumber;
    }
    public String answerQuestionLevel2(){
        Scanner answer = new Scanner(System.in);                            //give answer
        System.out.println("Please, give an answer: ");
        String userAnswer = answer.next().toUpperCase();
        return userAnswer;
    }

    public Boolean checkingAnswersLevel2(String userAnswer, int randomNumber){
        int index = 0;

        switch (userAnswer) {
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

        if (index == questionsL2.getQuestionsLevel2().get(randomNumber).getCorrectAnswer()) {       //it checks is the answer is correct
            isCorrect = true;
        } else {
            System.out.print("Sorry, it was the wrong answer. The correct answer was:   ");
            questionsL2.getQuestionsLevel2().get(randomNumber).printCorrectAnswer();
            System.out.println("~°~°~°~° You won the guaranteed prize of 1 000 €. Better luck next time! ~°~°~°~°");
            isCorrect = false;
        }
        return isCorrect;
    }

    public boolean isUserWon2( ) {
        return userWon2;
    }
}
