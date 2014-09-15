/**
 *
 * @author Krista
 */
package TriviaGame;

import  javax.swing.*;

public class GameFrame extends JFrame
{
       JPanel AnswerPanel = new JPanel();
       JPanel GameButtonPanel = new JPanel();
       JPanel InformationPanel = new JPanel();
       JPanel Player1Panel = new JPanel();
       JPanel Player2Panel = new JPanel();
       JPanel Player3Panel = new JPanel();
       JPanel Player4Panel = new JPanel();
       JPanel PlayerPanel = new JPanel();
       JPanel QuestionPanel = new JPanel();
       JButton btnAnswer = new JButton();
       JButton btnExit = new JButton();
       ButtonGroup btngrpAnswers = new ButtonGroup();
       JMenuItem itmAbout = new JMenuItem();
       JMenuItem itmExit = new JMenuItem();
       JMenuItem itmHowToPlay = new JMenuItem();
       JMenuBar jMenuBar1 = new JMenuBar();
       JLabel lblQuestion = new JLabel();
       JLabel lblAnswerA = new JLabel();
       JLabel lblAnswerB = new JLabel();
       JLabel lblAnswerC = new JLabel();
       JLabel lblAnswerD = new JLabel();
       JLabel lblInformation = new JLabel();
       JLabel lblPlayer1Name = new JLabel();
       JLabel lblPlayer1NameValue = new JLabel();
       JLabel lblPlayer1Score = new JLabel();
       JLabel lblPlayer1ScoreValue = new JLabel();
       JLabel lblPlayer2Name = new JLabel();
       JLabel lblPlayer2NameValue = new JLabel();
       JLabel lblPlayer2Score = new JLabel();
       JLabel lblPlayer2ScoreValue = new JLabel();
       JLabel lblPlayer3Name = new JLabel();
       JLabel lblPlayer3NameValue = new JLabel();
       JLabel lblPlayer3Score = new JLabel();
       JLabel lblPlayer3ScoreValue = new JLabel();
       JLabel lblPlayer4Name = new JLabel();
       JLabel lblPlayer4NameValue = new JLabel();
       JLabel lblPlayer4Score = new JLabel();
       JLabel lblPlayer4ScoreValue = new JLabel();
       JMenu mnuFile = new JMenu();
       JMenu mnuHelp = new JMenu();
       JRadioButton rbtnAnswerA = new JRadioButton();
       JRadioButton rbtnAnswerB = new JRadioButton();
       JRadioButton rbtnAnswerD = new JRadioButton();
       JRadioButton rbtnAnswerC = new JRadioButton();
       JTextArea txtQuestions = new JTextArea();
       
       public GameFrame()
       {
           try
           {
               init();
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }
       }
       
       private void init()
       {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trivia Mania");

        Player1Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Player 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblPlayer1Name.setText("Name:");

        lblPlayer1Score.setText("Score:");

        lblPlayer1NameValue.setText("Player 1");
        lblPlayer1NameValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblPlayer1ScoreValue.setText("Score");
        lblPlayer1ScoreValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Player1PanelLayout = new javax.swing.GroupLayout(Player1Panel);
        Player1Panel.setLayout(Player1PanelLayout);
        Player1PanelLayout.setHorizontalGroup(
            Player1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player1PanelLayout.createSequentialGroup()
                .addGroup(Player1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Player1PanelLayout.createSequentialGroup()
                        .addComponent(lblPlayer1Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlayer1NameValue, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                    .addGroup(Player1PanelLayout.createSequentialGroup()
                        .addComponent(lblPlayer1Score)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlayer1ScoreValue, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Player1PanelLayout.setVerticalGroup(
            Player1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player1PanelLayout.createSequentialGroup()
                .addGroup(Player1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayer1NameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayer1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Player1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayer1Score)
                    .addComponent(lblPlayer1ScoreValue))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        lblPlayer1Name.getAccessibleContext().setAccessibleName("lblPlayer1Name");
        lblPlayer1Score.getAccessibleContext().setAccessibleName("lblPlayer1Score");

        Player2Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Player 2:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblPlayer2ScoreValue.setText("Score");
        lblPlayer2ScoreValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblPlayer2Score.setText("Score:");

        lblPlayer2Name.setText("Name:");

        lblPlayer2NameValue.setText("Player 1");
        lblPlayer2NameValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Player2PanelLayout = new javax.swing.GroupLayout(Player2Panel);
        Player2Panel.setLayout(Player2PanelLayout);
        Player2PanelLayout.setHorizontalGroup(
            Player2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
            .addGroup(Player2PanelLayout.createSequentialGroup()
                .addGroup(Player2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Player2PanelLayout.createSequentialGroup()
                        .addComponent(lblPlayer2Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlayer2NameValue, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                    .addGroup(Player2PanelLayout.createSequentialGroup()
                        .addComponent(lblPlayer2Score)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlayer2ScoreValue, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Player2PanelLayout.setVerticalGroup(
            Player2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
            .addGroup(Player2PanelLayout.createSequentialGroup()
                .addGroup(Player2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayer2NameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayer2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Player2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayer2Score)
                    .addComponent(lblPlayer2ScoreValue))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        Player3Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Player 3:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblPlayer3ScoreValue.setText("Score");
        lblPlayer3ScoreValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblPlayer3Score.setText("Score:");

        lblPlayer3Name.setText("Name:");

        lblPlayer3NameValue.setText("Player 1");
        lblPlayer3NameValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Player3PanelLayout = new javax.swing.GroupLayout(Player3Panel);
        Player3Panel.setLayout(Player3PanelLayout);
        Player3PanelLayout.setHorizontalGroup(
            Player3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Player3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Player3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Player3PanelLayout.createSequentialGroup()
                        .addComponent(lblPlayer3Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlayer3NameValue, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                    .addGroup(Player3PanelLayout.createSequentialGroup()
                        .addComponent(lblPlayer3Score)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlayer3ScoreValue, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Player3PanelLayout.setVerticalGroup(
            Player3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player3PanelLayout.createSequentialGroup()
                .addGroup(Player3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayer3NameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayer3Name, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Player3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayer3Score)
                    .addComponent(lblPlayer3ScoreValue))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        Player4Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Player 4:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblPlayer4ScoreValue.setText("Score");
        lblPlayer4ScoreValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblPlayer4Score.setText("Score:");

        lblPlayer4Name.setText("Name:");

        lblPlayer4NameValue.setText("Player 1");
        lblPlayer4NameValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Player4PanelLayout = new javax.swing.GroupLayout(Player4Panel);
        Player4Panel.setLayout(Player4PanelLayout);
        Player4PanelLayout.setHorizontalGroup(
            Player4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player4PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Player4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Player4PanelLayout.createSequentialGroup()
                        .addComponent(lblPlayer4Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlayer4NameValue, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                    .addGroup(Player4PanelLayout.createSequentialGroup()
                        .addComponent(lblPlayer4Score)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlayer4ScoreValue, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Player4PanelLayout.setVerticalGroup(
            Player4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player4PanelLayout.createSequentialGroup()
                .addGroup(Player4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayer4NameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayer4Name, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Player4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayer4Score)
                    .addComponent(lblPlayer4ScoreValue))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PlayerPanelLayout = new javax.swing.GroupLayout(PlayerPanel);
        PlayerPanel.setLayout(PlayerPanelLayout);
        PlayerPanelLayout.setHorizontalGroup(
            PlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(Player1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Player2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Player3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Player4Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PlayerPanelLayout.setVerticalGroup(
            PlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerPanelLayout.createSequentialGroup()
                .addGroup(PlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Player1Panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Player4Panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Player3Panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Player2Panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        btnExit.setText("Exit");

        javax.swing.GroupLayout GameButtonPanelLayout = new javax.swing.GroupLayout(GameButtonPanel);
        GameButtonPanel.setLayout(GameButtonPanelLayout);
        GameButtonPanelLayout.setHorizontalGroup(
            GameButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GameButtonPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(44, 44, 44))
        );
        GameButtonPanelLayout.setVerticalGroup(
            GameButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GameButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnExit))
        );
        
       txtQuestions.setWrapStyleWord(true);
       txtQuestions.setEditable(false);
       txtQuestions.setLineWrap(true);
       
        QuestionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Question:"));

        javax.swing.GroupLayout QuestionPanelLayout = new javax.swing.GroupLayout(QuestionPanel);
        QuestionPanel.setLayout(QuestionPanelLayout);
        QuestionPanelLayout.setHorizontalGroup(
            QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
            .addComponent(txtQuestions)
        );
        QuestionPanelLayout.setVerticalGroup(
            QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
            .addComponent(txtQuestions)
        );

        AnswerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Answers:"));

        btnAnswer.setText("Answer");
        
        btngrpAnswers.add(rbtnAnswerA);
        rbtnAnswerA.setText("A.");

        btngrpAnswers.add(rbtnAnswerB);
        rbtnAnswerB.setText("B.");

        btngrpAnswers.add(rbtnAnswerC);
        rbtnAnswerC.setText("C.");

        btngrpAnswers.add(rbtnAnswerD);
        rbtnAnswerD.setText("D.");

        lblAnswerA.setText("Answer A");

        lblAnswerB.setText("Answer B");

        lblAnswerC.setText("Answer C");

        lblAnswerD.setText("Answer D");

        javax.swing.GroupLayout AnswerPanelLayout = new javax.swing.GroupLayout(AnswerPanel);
        AnswerPanel.setLayout(AnswerPanelLayout);
        AnswerPanelLayout.setHorizontalGroup(
            AnswerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnswerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AnswerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AnswerPanelLayout.createSequentialGroup()
                        .addComponent(btnAnswer)
                        .addGap(191, 191, 191))
                    .addGroup(AnswerPanelLayout.createSequentialGroup()
                        .addComponent(rbtnAnswerA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAnswerA, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(AnswerPanelLayout.createSequentialGroup()
                        .addComponent(rbtnAnswerB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAnswerB, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(AnswerPanelLayout.createSequentialGroup()
                        .addComponent(rbtnAnswerC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAnswerC, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(AnswerPanelLayout.createSequentialGroup()
                        .addComponent(rbtnAnswerD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAnswerD, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        AnswerPanelLayout.setVerticalGroup(
            AnswerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AnswerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AnswerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnAnswerA)
                    .addComponent(lblAnswerA))
                .addGap(18, 18, 18)
                .addGroup(AnswerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnAnswerB)
                    .addComponent(lblAnswerB))
                .addGap(18, 18, 18)
                .addGroup(AnswerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnAnswerC)
                    .addComponent(lblAnswerC))
                .addGap(18, 18, 18)
                .addGroup(AnswerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnAnswerD)
                    .addComponent(lblAnswerD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(btnAnswer))
        );

        javax.swing.GroupLayout InformationPanelLayout = new javax.swing.GroupLayout(InformationPanel);
        InformationPanel.setLayout(InformationPanelLayout);
        InformationPanelLayout.setHorizontalGroup(
            InformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        InformationPanelLayout.setVerticalGroup(
            InformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        mnuFile.setText("File");

        itmExit.setText("Exit");
        mnuFile.add(itmExit);

        jMenuBar1.add(mnuFile);

        mnuHelp.setText("Help");

        itmAbout.setText("About");
        mnuHelp.add(itmAbout);

        itmHowToPlay.setText("How To Play");
        mnuHelp.add(itmHowToPlay);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GameButtonPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AnswerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QuestionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PlayerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InformationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PlayerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(QuestionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnswerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(GameButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        
        pack();
       }
}
