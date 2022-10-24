import java.util.ArrayList;

//this is the list of the possible questions for level 1 questions

public class QuestionRepositoryLevel1 {

    private ArrayList<Question> questionsLevel1 = new ArrayList<>();


    public QuestionRepositoryLevel1() {            //CONSTRUCTOR
        this.questionsLevel1 = questionsLevel1;
        questionsLevel1.add(new Question("Who is the most handsome out of the following individuals?", new String[]{"A. Nikolaos", "B. Marios", "C. David", "D. Helder"}, 3));
        questionsLevel1.add(new Question("What is first 5 digits of PI? ", new String[]{"A. 3,1492", "B. 3,1415", "C. 3,1425", "D. 3,1525"}, 1));
        questionsLevel1.add(new Question("A person with well-developed abdominal muscles is said to have a what?", new String[]{"A. One-pack", "B. Six-pack", "C. 12-pack", "D. Family-pack"}, 1));
        questionsLevel1.add(new Question("\"Hakuna Matata\" is a famous line in which Disney movie?", new String[]{"A. Snow White and the Seven Dwarfs", "B. Bambi", "C. The Lion King", "D. Toy Story"}, 2));
        questionsLevel1.add(new Question("Who is the most famous actress of Lara Croft?", new String[]{"A. Sandra Bullock", "B. Angelina Jolie", "C. Meryl Streep", "D. Julia Roberts"}, 1));
        questionsLevel1.add(new Question("On which continent is Mozambique located?", new String[]{"A. Europe", "B. North America", "C. South Pole ", "D. Africa"}, 3));
        questionsLevel1.add(new Question("What is the largest river in the world by volume of water? ", new String[]{"A. Nile", "B. Amazon", "C. Pinios", "D. Danube"}, 1));
        questionsLevel1.add(new Question("How many were the muses in ancient Greek Mythology?", new String[]{"A. 7", "B. 120", "C. 9", "D. 45"}, 2));
        questionsLevel1.add(new Question("Which country is closest to the North Pole?", new String[]{"A. Denmark", "B. United Kingdom", "C. China", "D. Canada"}, 3));
        questionsLevel1.add(new Question("Who wrote the US Declaration of Independence? ", new String[]{"A. George Washington", "B. Graham Bell", "C. Madonna", "D. Thomas Jefferson"}, 0));
        questionsLevel1.add(new Question("Which of these is not a name of a well-known app? ", new String[]{"A. TikTok", "B. Snapchat", "C. BeReal", "D. TipTap"}, 3));
        questionsLevel1.add(new Question("Which Disney character famously leaves a glass slipper behind at a royal ball? ", new String[]{"A. Pocahontas", "B. Sleeping Beauty", "C. Cinderella", "D. Elsa"}, 2));
        questionsLevel1.add(new Question("Who was the Ancient Greek God/Goddess of the War? ", new String[]{"A. Apollo", "B. Athene", "C. Aphrodite", "D. Artemis"}, 1));
        questionsLevel1.add(new Question("Where was Helder born? ", new String[]{"A. Bonn", "B. Lisboa", "C. Porto", "D. Barcelona"}, 2));
        questionsLevel1.add(new Question("What is the name of that region that serves as a global center for high technology and innovation? ", new String[]{"A. Iron Valley", "B. Hydro Valley", "C. Tech Valley", "D. Silicon Valley"}, 3));
    }

    public ArrayList<Question> getQuestionsLevel1( ) {
        return questionsLevel1;
    }

    }

