/*
 * Player.java creates a player class that is used in the game class and contains
 * the player numbers, scores and names.
 */

package TriviaGame;

/**
 *
 * @author Krista
 */

public class Player 
{
    // variable declaration
    private int playerNumber, playerScore;
    private String playerName;

    // default constructor with no parameters
    public Player()
    {
    }
    
    // constructor with name and number as parameters - playerScore is always 
    // started out at 0
    public Player(String playerName, int playerNumber)
    {
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        playerScore = 0;
    }

    // Getters/Setters
    public String getPlayerName()
    {
        return playerName;
    }

    public int getPlayerNumber()
    {
        return playerNumber;
    }

    public int getPlayerScore()
    {
        return playerScore;
    }

    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }

    public void setPlayerNumber(int playerNumber)
    {
        this.playerNumber = playerNumber;
    }

    public void setPlayerScore(int playerScore)
    {
        this.playerScore = playerScore;
    }
    
}
