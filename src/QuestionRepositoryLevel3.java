import java.util.ArrayList;
//this is the list of the possible questions for level 3 questions
public class QuestionRepositoryLevel3 {
    private ArrayList<Question> questionsLevel3 = new ArrayList<>();
    public  QuestionRepositoryLevel3() {
        this.questionsLevel3 = questionsLevel3;
        questionsLevel3.add(new Question("When is the international Star Wars day? (Month / Day )",new String[]{"A. 05.04", "B. 02.23","C. 04.20", "D. 10.24"}, 0 ));
        questionsLevel3.add(new Question("Who was the President of the USA between Jan. 20, 1981–Jan. 20, 1989?",new String[]{"A. James Earl Carter" ,"B. Ronald Reagan" ,"C. George Bush","D. John F. Kennedy"}, 1 ));
        questionsLevel3.add(new Question("What is the birth name of \"Lady Gaga\"?",new String[]{"A. Stacy Ann Ferguson", "B. Shakira Isabel Mebarak Ripoll", "C. Stefani Joanne Angelina Germanotta", "D. Madonna Louise Ciccone"}, 2 ));
        questionsLevel3.add(new Question("Who won the  FIFA World Cup at 2002?",new String[]{"A. Germany","B. Brazil", "C. Netherlands", "B. Portugal"}, 1 ));
        questionsLevel3.add(new Question("Who draw the Dragon Ball manga?",new String[]{"A. Masashi Kishimoto", "B. Kubo Tite", "C. Akira Toriyama", "D. Eiichiro Oda" }, 2 ));
        questionsLevel3.add(new Question("Construction of which of these famous landmarks was completed first?",new String[]{"A. Empire State Building", "B. Royal Albert Hall", "C. Eiffel Tower", "D. Big Ben Clock Tower" }, 3 ));
        questionsLevel3.add(new Question("In 1718, which pirate died in battle off the coast of what is now North Carolina?",new String[]{"A. Calico Jack", "B. Blackbeard", "C. Bertholomew Roberts", "D. Captain Kidd" }, 1 ));
        questionsLevel3.add(new Question("What Netflix show had the most streaming views in 2021?",new String[]{"A. Money Heist", "B. Squid Game", "C. The Bridgerton", "D. Stranger Things" }, 1 ));
        questionsLevel3.add(new Question("How many elements are in the periodic table?",new String[]{"A. 98", "B. 128", "C. 118", "D. 78" }, 2 ));
        questionsLevel3.add(new Question("How much percentage of Denmark’s energy is renewable in 2022?",new String[]{"A. 37", "B. 47", "C. 57", "D. 67" }, 3 ));
        questionsLevel3.add(new Question("Which state is famous for Hollywood?",new String[]{"A. Alabama", "B. California", "C. Texas", "D. North Carolina" }, 1 ));
        questionsLevel3.add(new Question("Where is the Great Pyramid of Giza?",new String[]{"A. Morocco", "B. Egypt", "C. Libya", "D. Ethiopia" }, 1 ));
        questionsLevel3.add(new Question("What’s the smallest country in the world?",new String[]{"A. Vatican", "B. Lesotho", "C. Luxembourg", "D. Ghana" }, 0 ));
        questionsLevel3.add(new Question("How many time zones are there in Russia?",new String[]{"A. 11", "B. 5", "C. 8", "D. 9" }, 0 ));
        questionsLevel3.add(new Question("How many keys does a classic piano have?",new String[]{"A. 76", "B. 90", "C. 88", "D. 92" }, 2 ));
    }

    public ArrayList<Question> getQuestionsLevel3( ) {
        return questionsLevel3;
    }
}
