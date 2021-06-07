// Aania Garg
// Samitha Nadella
// AP Computer Science A
// June 7, 2021

// Purpose: To create a game of snakes and ladders

package snakesandladders;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.Random;

public class Driver extends JFrame /*implements ActionListener*/{
    public JPanel gamePanel;
    public JButton btn;
	public JLabel lblMessage, lblTurn, lblGot;
    private Player currentPlayer;
    Player player1 = new Player("Player 1", "blue");
    Player player2 = new Player("Player 2", "red");
    //Player player3 = new Player("Player 3", "green");
    //Player player4 = new Player("Player 4", "yellow");

    public static void main(String[] args){
        JFrame frame = new JFrame("Snakes and Ladders");
        //set default size of frame
		frame.setSize(736, 900);
		//make exit button work
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JTextField tf = new JTextField(20);
        tf.setLayout(null);
        tf.setEditable(false);

        //ImageIcon icon = new ImageIcon("https://i.pinimg.com/736x/a3/08/6e/a3086e96af1d54335c42e00e237dbd8b.jpg");
        //JLabel label = new JLabel(icon);

        JButton dice = new JButton("roll dice");
        JButton startGame = new JButton("start game");
        JButton playerOne = new JButton("move player one");
        JButton playerTwo = new JButton("move player two");

        panel.add(dice);
        panel.add(startGame);
        panel.add(playerOne);
        panel.add(playerTwo);
        panel.add(tf);

        frame.add(panel);
        //frame.add(label);
        frame.setVisible(true);

        dice.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int randomRoll = (int)(Math.random() * 6 + 1);
                tf.setText("dice rolled " + randomRoll);
            }
        });

        playerOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //TODO make method that moves position
                tf.setText("player 1 moved. player 2's turn");
            }
        });

        playerTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //TODO make method that moves position
                tf.setText("player 2 moved. player 1's turn");
            }
        });

    }
}
