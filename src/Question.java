import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

// this class handles questions, answers; this is OUR QUESTION OBJECT
//methods to print the questions, answers and setters/getters for variables
public class Question {

    private String question;
    private String[] answers = new String[4];
    private int correctAnswer;

    public Question(String question, String[] answers, int correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion( ) {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getAnswers( ) {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public int getCorrectAnswer( ) {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    public String getAnswersList(){
        return Arrays.toString(answers);
    }

    public void printAnswers(){                            //printing the optional answers
        for(int i = 0; i < answers.length; i++){
            String answer = answers[i];
            System.out.println(answer + " ");
        }
        System.out.println();
    }

    public void printCorrectAnswer(){                    //printing the correct answer

            String answer = answers[correctAnswer];
            System.out.println(answer);


    }
}
