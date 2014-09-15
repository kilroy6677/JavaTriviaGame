/*
 * Question.java sets up the Question class which includes questions with their
 * corresponding correct answers and 3 wrong answers.  It also includes a method  
 * that creates a question ArrayList for use in the Game class.
 */

package TriviaGame;

import java.util.ArrayList;
/**
 *
 * @author Krista
 */
public class Question 
{
    // declare all variables used
    String question;
    String rightAnswer;
    String wrongAnswer1;
    String wrongAnswer2;
    String wrongAnswer3;
    ArrayList<Question> questions = new ArrayList<Question>();
    
    // default no parameter constructor
    public Question()
    {
    }

    // constructor with string parameters
    public Question(String question, String rightAnswer, String wrongAnswer1,
            String wrongAnswer2, String wrongAnswer3)
    {
        this.question = question;
        this.rightAnswer = rightAnswer;
        this.wrongAnswer1 = wrongAnswer1;
        this.wrongAnswer2 = wrongAnswer2;
        this.wrongAnswer3 = wrongAnswer3;
    }
    
    // Getters/Setters
    public String getQuestion()
    {
        return question;
    }

    public String getRightAnswer()
    {
        return rightAnswer;
    }

    public String getWrongAnswer1()
    {
        return wrongAnswer1;
    }

    public String getWrongAnswer2()
    {
        return wrongAnswer2;
    }

    public String getWrongAnswer3()
    {
        return wrongAnswer3;
    }

    public void setQuestion(String question)
    {
        this.question = question;
    }

    public void setQuestions(ArrayList<Question> questions)
    {
        this.questions = questions;
    }

    public void setRightAnswer(String rightAnswer)
    {
        this.rightAnswer = rightAnswer;
    }

    public void setWrongAnswer1(String wrongAnswer1)
    {
        this.wrongAnswer1 = wrongAnswer1;
    }

    public void setWrongAnswer2(String wrongAnswer2)
    {
        this.wrongAnswer2 = wrongAnswer2;
    }

    public void setWrongAnswer3(String wrongAnswer3)
    {
        this.wrongAnswer3 = wrongAnswer3;
    }
    
    // method used to create a question array containing various questions for
    // the game.
    public static ArrayList<Question> createQuestionArrayList()
    {
        //Initializes the new ArrayList and Question
        ArrayList<Question> quest = new ArrayList<Question>();

        // sets the Question, RightAnswer and WrongAnswers for each question and
        // adds the question to the ArrayList
        
        Question question = new Question();
        question.setQuestion("What NFL team won the most games in the 1960s?");
        question.setRightAnswer("The Green Bay Packers");
        question.setWrongAnswer1("The Kansas City Chiefs");
        question.setWrongAnswer2("The Seattle Redskins");
        question.setWrongAnswer3("The Dallas Cowboys");
        quest.add(question);
        
        
        question = new Question();
        question.setQuestion("What's the only country to border Denmark?");
        question.setRightAnswer("Germany");
        question.setWrongAnswer1("France");
        question.setWrongAnswer2("Poland");
        question.setWrongAnswer3("Sweden");
        quest.add(question);
        
        
        question = new Question();
        question.setQuestion("How many bacteria can be found in a typical cubic inch of garden soil?");
        question.setRightAnswer("30 billion");
        question.setWrongAnswer1("30 thousand");
        question.setWrongAnswer2("30 million");
        question.setWrongAnswer3("3 thousand");
        quest.add(question);
        
        
        question = new Question();
        question.setQuestion("What condiment is Lea and Perrins most famous for?");
        question.setRightAnswer("Worcestershire Sauce");
        question.setWrongAnswer1("Soy Sauce");
        question.setWrongAnswer2("Salad Dressing");
        question.setWrongAnswer3("Ketchup");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("What country saw its assets frozen in U.S. banks" +
                "in November, 1979?");
        question.setRightAnswer("Iran");
        question.setWrongAnswer1("Iraq");
        question.setWrongAnswer2("Egypt");
        question.setWrongAnswer3("Kuwait");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("What Asian capital's parasite museum do tourists" +
                " flock to, to gawk at a 9-meter tapeworm removed from a human in 1986?");
        question.setRightAnswer("Tokyo's");
        question.setWrongAnswer1("Beijing's");
        question.setWrongAnswer2("New Dehli's");
        question.setWrongAnswer3("Seoul's");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("What sounds were mud puppies falsely thought to make," +
                " accounting for their name?");
        question.setRightAnswer("Barks");
        question.setWrongAnswer1("Whines");
        question.setWrongAnswer2("Moos");
        question.setWrongAnswer3("Purrs");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("What Ivy League football team once lost an NCAA record 44 " +
                "straigt games?");
        question.setRightAnswer("Columbia");
        question.setWrongAnswer1("Yale");
        question.setWrongAnswer2("Harvard");
        question.setWrongAnswer3("Berkeley");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("What nation voted to adopt a 10-day week, 10-hour day, " +
                "100-minutes hour and 100-second minute in 1795?");
        question.setRightAnswer("France");
        question.setWrongAnswer1("Germany");
        question.setWrongAnswer2("USA");
        question.setWrongAnswer3("England");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("What toothpaste brand has a name combining the Greek word " +
                "for \"digestion\" and the Latin for \"tooth\"?");
        question.setRightAnswer("Pepsodent");
        question.setWrongAnswer1("Aquafresh");
        question.setWrongAnswer2("Sensodyne");
        question.setWrongAnswer3("Colgate");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("What year did Volkswagen first use the ball joint front end on the beatle?");
        question.setRightAnswer("1967");
        question.setWrongAnswer1("1968");
        question.setWrongAnswer2("1966");
        question.setWrongAnswer3("1956");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("Who is known as the father of the Volkswagen?");
        question.setRightAnswer("Dr. Porsche");
        question.setWrongAnswer1("Magellan");
        question.setWrongAnswer2("Harry Truman");
        question.setWrongAnswer3("Adolf Hitler");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("Which state has the longest coast line?");
        question.setRightAnswer("Alaska");
        question.setWrongAnswer1("Florida");
        question.setWrongAnswer2("California");
        question.setWrongAnswer3("Maine");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("What does Volkswagen mean in German?");
        question.setRightAnswer("Peoples' Car");
        question.setWrongAnswer1("Easy to Drive");
        question.setWrongAnswer2("Small Car with 4 Wheels");
        question.setWrongAnswer3("Mom's Car");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("Who was the first President of the United States of America?");
        question.setRightAnswer("George Washington");
        question.setWrongAnswer1("James Madison");
        question.setWrongAnswer2("Bill Clinton");
        question.setWrongAnswer3("Jesse James");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("What is the capital of Washington state?");
        question.setRightAnswer("Olympia");
        question.setWrongAnswer1("Seattle");
        question.setWrongAnswer2("Portland");
        question.setWrongAnswer3("Spokane");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("Who is the leader of GI Joe?");
        question.setRightAnswer("General Hawk");
        question.setWrongAnswer1("Beach Head");
        question.setWrongAnswer2("Duke");
        question.setWrongAnswer3("Wild Bill");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("Where did General Custer have his last stand?");
        question.setRightAnswer("Battle of Little Big Horn");
        question.setWrongAnswer1("Battle of Lost Creek");
        question.setWrongAnswer2("Battle of the Big Horn Gully");
        question.setWrongAnswer3("The Alamo");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("What is the largest animal in the world?");
        question.setRightAnswer("Blue Whale");
        question.setWrongAnswer1("Elephant");
        question.setWrongAnswer2("Giraffe");
        question.setWrongAnswer3("Orca");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("What did serial killer Charles Manson carve into his head" +
                "when he got bored with the 'X'?");
        question.setRightAnswer("The Swastika");
        question.setWrongAnswer1("666");
        question.setWrongAnswer2("Upside Down Cross");
        question.setWrongAnswer3("An Arrow");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("Which continent is divided into the most countries?");
        question.setRightAnswer("Africa");
        question.setWrongAnswer1("Asia");
        question.setWrongAnswer2("Europe");
        question.setWrongAnswer3("North America");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("Who won the World Series of Baseball in 2004?");
        question.setRightAnswer("Boston Red Sox");
        question.setWrongAnswer1("Seattle Mariners");
        question.setWrongAnswer2("Yankees");
        question.setWrongAnswer3("Dodgers");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("What brand name was on the world's first patented pneumatic tire?");
        question.setRightAnswer("Dunlop");
        question.setWrongAnswer1("Firestone");
        question.setWrongAnswer2("BF Goodrich");
        question.setWrongAnswer3("Mickey Thomson");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("In the folk song, 'My Darling Clementine', how did Clementine die?");
        question.setRightAnswer("She drowned.");
        question.setWrongAnswer1("She fell off a horse.");
        question.setWrongAnswer2("She fell off a cliff.");
        question.setWrongAnswer3("She was shot.");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("Who played the lead role of Aileen in the 2003 movie 'Monster'?");
        question.setRightAnswer("Charlize Theron");
        question.setWrongAnswer1("Drew Barrymore");
        question.setWrongAnswer2("Sharon Stone");
        question.setWrongAnswer3("Angelina Jolie");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("What have you eaten if you've just consumed a 'deutoplasm'?");
        question.setRightAnswer("An egg yolk");
        question.setWrongAnswer1("A vegetable that is grown underwater.");
        question.setWrongAnswer2("A seed bearing plant");
        question.setWrongAnswer3("The lining of an animal stomach.");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("Who directed the blockbuster Titanic?");
        question.setRightAnswer("James Camerom");
        question.setWrongAnswer1("Leonardo DiCaprio");
        question.setWrongAnswer2("John Rosenbaum");
        question.setWrongAnswer3("Amy Murphy");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("What is the name of the park ranger in the Yogi Bear cartoons?");
        question.setRightAnswer("Ranger John Smith");
        question.setWrongAnswer1("Ranger Rick Jones");
        question.setWrongAnswer2("Ranger Dave Thomas");
        question.setWrongAnswer3("Ranger Joe Dirt");
        quest.add(question);
        
        question = new Question();
        question.setQuestion("Where was the game of Chess invented?");
        question.setRightAnswer("India");
        question.setWrongAnswer1("Russia");
        question.setWrongAnswer2("United States");
        question.setWrongAnswer3("England");
        quest.add(question);
        
        // returns the ArrayList<Question> referenced by the quest variable.
        return quest;
    }

}
