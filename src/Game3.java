import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
// handles the game's logic - Level 3 - It's tha same as Level 1
public class Game3 {
    private QuestionRepositoryLevel3 questionsL3 = new QuestionRepositoryLevel3();
    private ArrayList<Integer> askedQuestionsLevel3 = new ArrayList<>();
    private boolean userWon3;
    private int[] prizesLevel3 = {64000, 125000, 250000,500000,1000000};
    private int prizeWon3;
    public void askingNextQuestionLevel3(){
        Scanner answerContinue = new Scanner(System.in);
        boolean isCorrect = true;
        userWon3 = true;
        int counter = 0;
        int counterQuestion = 11;

        do {
            if (askedQuestionsLevel3.size() < 4) {
                int randomNumber = askingQuestionLevel3(counterQuestion);
                String userAnswer = answerQuestionLevel3();
                isCorrect = checkingAnswersLevel3(userAnswer, randomNumber);

                if (isCorrect) {
                    prizeWon3 = prizesLevel3[counter];

                    System.out.printf("You won %,d €.\n", prizeWon3);
                    System.out.printf("You can win %,d € with the next question.\n", prizesLevel3[counter + 1]);
                    System.out.printf("Do you want to continue playing?\nYes / No\n");
                    String doContinue = answerContinue.next();

                    while (!doContinue.equals("Yes") && !doContinue.equals("No")){
                        System.out.printf("Do you want to continue playing?\nYes / No\n");
                        doContinue = answerContinue.next();
                    }
                    if (doContinue.equals("No")) {
                        System.out.println("You finished the Game");
                        System.out.printf("~°~°~°~° You won %,d €. ~°~°~°~°\n", prizeWon3);

                        userWon3 = false;
                        break;
                    }

                } else {
                    userWon3 = false;
                }
            } else {
                int randomNumber = askingQuestionLevel3(counterQuestion);
                String userAnswer = answerQuestionLevel3();
                isCorrect = checkingAnswersLevel3(userAnswer, randomNumber);

                if (isCorrect) {

                }   else {
                    userWon3 = false;
                }
            }
            counter++;
            counterQuestion++;
        } while (isCorrect && askedQuestionsLevel3.size() < 5);
    }

    public Integer askingQuestionLevel3(int counter){

        int randomNumber = ThreadLocalRandom.current().nextInt(0, 15);

        while (askedQuestionsLevel3.contains(randomNumber)){                            //checking that the question have been asked
            randomNumber = ThreadLocalRandom.current().nextInt(0,15);
        }

        System.out.println();
        System.out.println(counter + ". " + questionsL3.getQuestionsLevel3().get(randomNumber).getQuestion()); //asking the question
        questionsL3.getQuestionsLevel3().get(randomNumber).printAnswers();
        askedQuestionsLevel3.add(randomNumber);
        return randomNumber;
    }
    public String answerQuestionLevel3(){
        Scanner answer = new Scanner(System.in);                            //give answer
        System.out.println("Please, give an answer: ");
        String userAnswer = answer.next().toUpperCase();
        return userAnswer;
    }

    public Boolean checkingAnswersLevel3(String userAnswer, int randomNumber){
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

        if (index == questionsL3.getQuestionsLevel3().get(randomNumber).getCorrectAnswer()) {       //it checks is the answer is correct
            isCorrect = true;
        } else {
            System.out.printf("Sorry, it was the wrong answer. The correct answer was:   ");
            questionsL3.getQuestionsLevel3().get(randomNumber).printCorrectAnswer();
            System.out.println("~°~°~°~° You won the guaranteed prize of 32 000 €. Better luck next time! ~°~°~°~°");
            isCorrect = false;
        }
        return isCorrect;
    }

    public boolean isUserWon3( ) {
        return userWon3;
    }
}
