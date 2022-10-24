import java.util.ArrayList;
//this is the list of the possible questions for level 2 questions
public class QuestionRepositoryLevel2 {
    private ArrayList<Question> questionsLevel2 = new ArrayList<>();
    public  QuestionRepositoryLevel2() {
        this.questionsLevel2 = questionsLevel2;
        questionsLevel2.add(new Question("Who's nickname is the Greak Freak?", new String[]{"A. Tommy Lee", "B. Georgios Kalogiannidis", "C. Georgios Grigoriou", "D. Giannis Antetokounmpo"}, 3));
        questionsLevel2.add(new Question("Which character is famous for the \"Hello there\" line in Star Wars? ", new String[]{"A. Yoda", "B. Dath Vader", "C. Mace Windu", "D. Obi-Wan Kenobi"}, 3));
        questionsLevel2.add(new Question("Who is the main \"actor\" in the \"Men vs Wild\" survival TV series? ", new String[]{"A. Jake Gyllenhaal", "B. Shaquille O’Neal", "C. Bear Grylls", "D Hugh Jackman"}, 2));
        questionsLevel2.add(new Question("How much country shares border with Hungary?", new String[]{"A. 5", "B. 6", "C. 7", "D. 8"}, 2));
        questionsLevel2.add(new Question("Ferenc Puskás was a famous Hungarian football player, who played for the Spain team ....?", new String[]{"A. Barcelona", "B. Real Madrid", "C. Valencia", "D. Osasuna"}, 1));
        questionsLevel2.add(new Question("What is the largest planet in our solar system? ", new String[]{"A. Earth", "B. Mars", "C. Jupiter", "D. Venus"}, 2));
        questionsLevel2.add(new Question("Someone says \"Thank you\" to us in English. What do we answer him?", new String[]{"A. Nothing", "B. Did nothing", "C. You are welcome", "D. Don't worry"}, 2));
        questionsLevel2.add(new Question("How many states does the USA have?", new String[]{"A. 50", "B. 39", "C. 49", "D. 52"}, 0));
        questionsLevel2.add(new Question("Who is the leading scorer in NBA history?", new String[]{"A. Karl Malone", "B. Michael Jordan", "C. Kareem Abdul-Jabbar", "D. Lebron James"}, 2));
        questionsLevel2.add(new Question("What is the capital city of Switzerland ?", new String[]{"A. Bern", "B. Basel", "C. Lausanne", "D. Lucerne"}, 0));
        questionsLevel2.add(new Question("How many main series of Assassin’s Creed game were released?", new String[]{"A. 10", "B. 11", "C. 12", "D. 13"}, 2));
        questionsLevel2.add(new Question("What is the second most spoken language?", new String[]{"A. English", "B. Mandarin Chinese", "C. Spanish", "D. Hindi"}, 2));
        questionsLevel2.add(new Question("What character has both Robert Downey Jr. and Benedict Cumberbatch played?", new String[]{"A. Batman", "B. Sherlock Holmes", "C. Hamlet", "D. Macbeth"}, 1));
        questionsLevel2.add(new Question("What is the best-selling book series of the 21st century?", new String[]{"A. Twilight", "B. Harry Potter", "C. Hunger Games", "D. Fifty Shades"}, 1));
        questionsLevel2.add(new Question("What is the longest river in the World?", new String[]{"A. Amazon", "B. Mississippi", "C. Jangce", "D. Nile"}, 3));

    }

    public ArrayList<Question> getQuestionsLevel2( ) {
        return questionsLevel2;
    }
}
