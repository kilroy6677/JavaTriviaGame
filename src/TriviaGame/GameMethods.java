/*
 *This is a program written for class.  It's a trivia game designed for 1 - 4 
 * players.  
 */

package TriviaGame;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.util.*;
import java.awt.Frame;
import java.awt.event.*;

/**
 *
 * @author Krista
 */

public class GameMethods
{
    static GameFrame frame = new GameFrame();   // declares a new GameFrame
    static ArrayList<Question> quest =  // declares a new ArrayList and uses 
            Question.createQuestionArrayList(); // createQuestionArrayList to populate the ArrayList
    static int currentPlayer = 1;
    static int randomNumber;
    static Game game = InitializeGame();
    static int i = 0;
    static boolean result = false;
    
    private GameMethods()                       // default constructor - set to 
    {}                                          // private to restrict use
  
    public static void main(String[] args)
    {
        frame.setVisible(true);                 // sets the main frame of the game to visible
        StartGame();                            // calls the StartGame method
    }
    
    public static void StartGame()
    {
        frame.btnExit.addActionListener(new ExitListener());
        frame.btnAnswer.addActionListener(new ClickListener());
        frame.itmExit.addActionListener(new ExitListener());
        game.setNumOfPlayers(GetNumberOfPlayers());
        game.setPlayers(setPlayerNames(game));
        setFrameDisplay(game.getPlayers(), game);
        game.setQuestions(quest);
        QuestionPlayers(i, game);
    }
    
    public static Game InitializeGame()
    {
        Game newGame = new Game();
        return newGame;
    }
        
    public static int GetNumberOfPlayers()
    {
        int numOfPlayers;
        String players = JOptionPane.showInputDialog("Enter number of players(1-4): ");
        while (true)
        {
            try
            {
                numOfPlayers = Integer.parseInt(players);
                if (numOfPlayers > 4)
                {
                    players = JOptionPane.showInputDialog("Please enter a number between 1-4.\n" +
                            "Enter number of players(1-4): ");
                    try
                    {
                        numOfPlayers = Integer.parseInt(players);
                    }
                    catch (NumberFormatException e)
                    {
                        players = JOptionPane.showInputDialog("That's not an accepted number of players.\n" +
                        "Please enter the number of players.");
                    }
                }
                else
                    return numOfPlayers;
            }
            catch (NumberFormatException e)
            {
                players = JOptionPane.showInputDialog("That's not an accepted number of players.\n" +
                        "Please enter the number of players.");
            }
        }
    }
    
    public static ArrayList<Player> setPlayerNames(Game game)
    {
        ArrayList<Player> players = new ArrayList<Player>();
        int playerNumber = game.getNumOfPlayers();
        String playerName;
        for (int i=0; i<playerNumber; i++)
        {
            Player player = new Player();
            playerName = JOptionPane.showInputDialog("Player " + (i+1) + ", " +
                    "Please enter your name: ");
            player.setPlayerNumber(i + 1);
            player.setPlayerName(playerName);
            player.setPlayerScore(0);
            players.add(i, player);        
        }
        return players;
    }
    
    public static void setFrameDisplay(ArrayList<Player> players, Game game)
    {
        
        int playerFrames = game.getNumOfPlayers();
        String name1, name2, name3, name4;
        int score1, score2, score3, score4;
        frame.Player1Panel.setVisible(false);
        frame.Player2Panel.setVisible(false);
        frame.Player3Panel.setVisible(false);
        frame.Player4Panel.setVisible(false);

        switch (playerFrames)
        {
            case 4:
                frame.Player4Panel.setVisible(true);
                score4 = players.get(3).getPlayerScore();
                name4 = players.get(3).getPlayerName();
                frame.lblPlayer4NameValue.setText(name4);
                frame.lblPlayer4ScoreValue.setText("" + score4);
            case 3:
                frame.Player3Panel.setVisible(true);
                score3 = players.get(2).getPlayerScore();
                name3 = players.get(2).getPlayerName();
                frame.lblPlayer3NameValue.setText(name3);
                frame.lblPlayer3ScoreValue.setText("" + score3);
            case 2:
                frame.Player2Panel.setVisible(true);
                score2 = players.get(1).getPlayerScore();
                name2 = players.get(1).getPlayerName();
                frame.lblPlayer2NameValue.setText(name2);
                frame.lblPlayer2ScoreValue.setText("" + score2);
            case 1:
                frame.Player1Panel.setVisible(true);
                score1 = players.get(0).getPlayerScore();
                name1 = players.get(0).getPlayerName();
                frame.lblPlayer1NameValue.setText(name1);
                frame.lblPlayer1ScoreValue.setText("" + score1);
                break;
        }
    }
    
    public static void CheckCurrentPlayer()
    {
        switch (currentPlayer)
        {
            case 1:
                frame.lblInformation.setText("Player 1, Your turn!");
                break;
            case 2:
                frame.lblInformation.setText("Player 2, Your turn!");
                break;
            case 3:
                frame.lblInformation.setText("Player 3, Your turn!");
                break;
            case 4:
                frame.lblInformation.setText("Player 4, Your turn!");
                break;
        }
                
    }
    public static void QuestionPlayers(int questionNumber, Game game)
    {
        CheckCurrentPlayer();
        randomNumber = SetQuestionDisplay(questionNumber);
        answerCount = 0;
    }
    
    public static int SetQuestionDisplay(int i)
    {
        int rand1;
        rand1 = (int)(Math.random() * 4) +1;
        frame.rbtnAnswerA.setSelected(false);
        frame.rbtnAnswerB.setSelected(false);
        frame.rbtnAnswerC.setSelected(false);
        frame.rbtnAnswerD.setSelected(false);
        
        switch(rand1)
        {
            case 1:
               frame.lblAnswerA.setText(quest.get(i).getRightAnswer());
               frame.lblAnswerB.setText(quest.get(i).getWrongAnswer1());
               frame.lblAnswerC.setText(quest.get(i).getWrongAnswer2());
               frame.lblAnswerD.setText(quest.get(i).getWrongAnswer3());
               break;
           case 2:
               frame.lblAnswerA.setText(quest.get(i).getWrongAnswer1());
               frame.lblAnswerB.setText(quest.get(i).getRightAnswer());
               frame.lblAnswerC.setText(quest.get(i).getWrongAnswer2());
               frame.lblAnswerD.setText(quest.get(i).getWrongAnswer3());
               break;
            case 3:
                frame.lblAnswerA.setText(quest.get(i).getWrongAnswer1());
                frame.lblAnswerB.setText(quest.get(i).getWrongAnswer2());
                frame.lblAnswerC.setText(quest.get(i).getRightAnswer());
                frame.lblAnswerD.setText(quest.get(i).getWrongAnswer3());
               break;
            case 4:
                frame.lblAnswerA.setText(quest.get(i).getWrongAnswer1());
                frame.lblAnswerB.setText(quest.get(i).getWrongAnswer2());
                frame.lblAnswerC.setText(quest.get(i).getWrongAnswer3());
                frame.lblAnswerD.setText(quest.get(i).getRightAnswer());
                break;
        }
        frame.txtQuestions.setText(quest.get(i).getQuestion());
        return rand1;
    }
    
        
    static int answerCount=0;
    
    public static boolean CheckResult(Game game)
    {
        result = false;
        switch(randomNumber)
               {
                   case 1:
                       if(frame.rbtnAnswerA.isSelected() == true)
                           result = true;
                       break;
                   case 2:
                       if(frame.rbtnAnswerB.isSelected() == true)
                           result = true;
                       break;
                   case 3:
                       if(frame.rbtnAnswerC.isSelected() == true)
                           result = true;
                       break;
                   case 4:
                       if(frame.rbtnAnswerD.isSelected() == true)
                           result = true;
                       break;
               }
        return result;
    }
    
    public static void AdjustScore(Game game, int answerCount)
    {
           ArrayList<Player> players = game.getPlayers();
           switch(currentPlayer)
                   {
                       case 1:
                           switch(answerCount)
                           {
                               case 1:
                                   players.get(0).setPlayerScore(players.get(0).getPlayerScore() + 100);
                                   frame.lblPlayer1ScoreValue.setText("" + players.get(0).getPlayerScore());
                                   break;
                               case 2:
                                   players.get(0).setPlayerScore(players.get(0).getPlayerScore() + 50);
                                   frame.lblPlayer1ScoreValue.setText("" + players.get(0).getPlayerScore());
                                   break;
                               case 3:
                                   players.get(0).setPlayerScore(players.get(0).getPlayerScore() + 25);
                                   frame.lblPlayer1ScoreValue.setText("" + players.get(0).getPlayerScore());
                                   break;
                           }
                           break;
                       case 2:
                           switch(answerCount)
                           {
                               case 1:
                                   players.get(1).setPlayerScore(players.get(1).getPlayerScore() + 100);
                                   frame.lblPlayer2ScoreValue.setText("" + players.get(1).getPlayerScore());
                                   break;
                               case 2:
                                   players.get(1).setPlayerScore(players.get(1).getPlayerScore() + 50);
                                   frame.lblPlayer2ScoreValue.setText("" + players.get(1).getPlayerScore());
                                   break;
                               case 3:
                                   players.get(1).setPlayerScore(players.get(1).getPlayerScore() + 25);
                                   frame.lblPlayer2ScoreValue.setText("" + players.get(1).getPlayerScore());
                                   break;
                           }
                           break;
                       case 3:
                           switch (answerCount)
                           {
                               case 1:
                                   players.get(2).setPlayerScore(players.get(2).getPlayerScore() + 100);
                                   frame.lblPlayer3ScoreValue.setText("" + players.get(2).getPlayerScore());
                                   break;
                               case 2:
                                   players.get(2).setPlayerScore(players.get(2).getPlayerScore() + 50);
                                   frame.lblPlayer3ScoreValue.setText("" + players.get(2).getPlayerScore());
                                   break;
                               case 3:
                                   players.get(2).setPlayerScore(players.get(2).getPlayerScore() + 25);
                                   frame.lblPlayer3ScoreValue.setText("" + players.get(2).getPlayerScore());
                                   break;
                           }
                           break;
                       case 4:
                           switch (answerCount)
                           {
                               case 1:
                                   players.get(3).setPlayerScore(players.get(3).getPlayerScore() + 100);
                                   frame.lblPlayer4ScoreValue.setText("" + players.get(3).getPlayerScore());
                                   break;
                               case 2:
                                   players.get(3).setPlayerScore(players.get(3).getPlayerScore() + 50);
                                   frame.lblPlayer4ScoreValue.setText("" + players.get(3).getPlayerScore());
                                   break;
                               case 3:
                                   players.get(3).setPlayerScore(players.get(3).getPlayerScore() + 25);
                                   frame.lblPlayer4ScoreValue.setText("" + players.get(3).getPlayerScore());
                                   break;
                            }
                           break;
                   }
    }
    
    public static void CheckWinner()
    {
        int players = game.getNumOfPlayers();
        ArrayList<Player> player = game.getPlayers();
        switch(players)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "Congrats " + player.get(0).getPlayerName() + 
                        ", you are the winner by default");
                break;
            case 2:
                if(player.get(0).getPlayerScore() > player.get(1).getPlayerScore())
                    JOptionPane.showMessageDialog(null, "Congrats " + player.get(0).getPlayerName() + 
                            ", You are the Winner!");
                else
                    JOptionPane.showMessageDialog(null, "Congrats " + player.get(1).getPlayerName() +
                            ", You are the Winner!");
                break;
            case 3:
                if(player.get(0).getPlayerScore() > player.get(1).getPlayerScore() &
                        player.get(0).getPlayerScore() > player.get(2).getPlayerScore())
                    JOptionPane.showMessageDialog(null, "Congrats " + player.get(0).getPlayerName() +
                            ", You are the Winner!");
                else if (player.get(1).getPlayerScore() > player.get(2).getPlayerScore())
                    JOptionPane.showMessageDialog(null, "Congrats "+ player.get(1).getPlayerName() +
                            ", You are the Winner!");
                else
                    JOptionPane.showMessageDialog(null, "Congrats " + player.get(2).getPlayerName() +
                            ", You are the Winner!");
                break;
            case 4:
                if (player.get(0).getPlayerScore() > player.get(1).getPlayerScore() &
                        player.get(0).getPlayerScore() > player.get(2).getPlayerScore() & 
                        player.get(0).getPlayerScore() > player.get(3).getPlayerScore())
                    JOptionPane.showMessageDialog(null, "Congrats " + player.get(0).getPlayerName() +
                            ", You are the Winner!");
                else if (player.get(1).getPlayerScore() > player.get(2).getPlayerScore() &
                        player.get(1).getPlayerScore() > player.get(3).getPlayerScore())
                    JOptionPane.showMessageDialog(null, "Congrats "+ player.get(1).getPlayerName() +
                            ", You are the Winner!");
                else if (player.get(2).getPlayerScore() > player.get(3).getPlayerScore())
                    JOptionPane.showMessageDialog(null, "Congrats " + player.get(2).getPlayerName() +
                            ", You are the Winner!");
                else
                    JOptionPane.showMessageDialog(null, "Congrats " + player.get(3).getPlayerName() +
                            ", You are the Winner!");
        }
    }
    
    public static class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            answerCount+=1;
            result = CheckResult(game);
            if(result != true & answerCount <= 3)
            {
                frame.lblInformation.setText("You are incorrect.  Please try again.");
            }
            else if (result != true & answerCount > 3)
            {
                JOptionPane.showMessageDialog(null, "You did not guess the right answer!  Your turn is over!");
                if (currentPlayer < game.getNumOfPlayers())
                   currentPlayer += 1;
               else
                   currentPlayer = 1; 
               i+=1;
               if (i<quest.size())
                   QuestionPlayers(i, game);
               else
                   CheckWinner();
            }
            else if (result == true)
            {
                frame.lblInformation.setText("Player " + currentPlayer + ", you are correct!");
                AdjustScore(game, answerCount);
                if (currentPlayer < game.getNumOfPlayers())
                       currentPlayer += 1;
               else
                   currentPlayer = 1;
           i+=1;     
           if (i<quest.size())
               QuestionPlayers(i, game);
           else
               CheckWinner();
            }
        }
    }
    
    public static class ExitListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
}