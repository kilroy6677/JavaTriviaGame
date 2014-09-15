/*
 * Creates a game class that holds the player and question arraylists.
 * 
 */

package TriviaGame;

import java.util.ArrayList;

/**
 *
 * @author Krista
 */
public class Game 
{
    // declaring all the variables
    private ArrayList<Player> players = new ArrayList<Player>();
    private ArrayList<Question> questions = Question.createQuestionArrayList();
    private int numOfPlayers;
    
    // default constructor with no parameters
    public Game()
    {
    }

    // Getters/Setters
    public void setNumOfPlayers(int numOfPlayers)
    {
        this.numOfPlayers = numOfPlayers;
    }

    public void setPlayers(ArrayList<Player> players)
    {
        this.players = players;
    }

    public void setQuestions(ArrayList<Question> questions)
    {
        this.questions = questions;
    }

    public int getNumOfPlayers()
    {
        return numOfPlayers;
    }

    public ArrayList<Player> getPlayers()
    {
        return players;
    }

    public ArrayList<Question> getQuestions()
    {
        return questions;
    }
    
}
