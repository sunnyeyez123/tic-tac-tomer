import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * @author Jasmine Lawrence 
 * 
 * 
 * 
 * 
 * 
 * */
@SuppressWarnings("serial")
public class GameBoard extends JPanel {

	private int rows;
	private int cols;
	private int turn;
	private ImageIcon player1;
	private ImageIcon player2;
	private Tile[][] tiles;

	public GameBoard() {
		turn = 1;
		rows = 3;
		cols = 3;
		tiles = new Tile[rows][cols];

		player1 = new ImageIcon("tomermain.jpg");
		player2 = new ImageIcon("tomerscarf.jpg");

		setLayout(new GridLayout(rows, cols));
		setPreferredSize(new Dimension(400, 400));
		ButtonListener bListen = new ButtonListener();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				tiles[i][j] = new Tile();
				tiles[i][j].addActionListener(bListen);
				tiles[i][j].setXLoc(i);
				tiles[i][j].setYLoc(j);
				add(tiles[i][j]);
			}
		}

	}

	public void reset() {
		turn = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				tiles[i][j].setImage(null);
				tiles[i][j].setPlayer(0);


			}
		}

	}

	public void setPlayer1Icon(ImageIcon img) {
		player1 = img;
	}

	public void setPlayer2Icon(ImageIcon img) {
		player2 = img;
	}

	public boolean samePlayer(Tile one, Tile two, Tile three) {
		boolean truth = false;

		if (one.getPlayer() == two.getPlayer()
				&& two.getPlayer() == three.getPlayer()) {
			truth = true;
		}

		return truth;
	}

	public void checkTicTacToe() {
		// check horizontal
		int winner = 0;

		Tile one = tiles[0][0];
		Tile two = tiles[0][1];
		Tile three = tiles[0][2];
		if (samePlayer(one, two, three)) {
			winner = one.getPlayer();

			if(winner !=0){
			JOptionPane.showMessageDialog(this, "Player " + one.getPlayer()
					+ " wins!");
			this.reset();
			}
		}
		
		 one = tiles[1][0];
		 two = tiles[1][1];
		 three = tiles[1][2];
		if (samePlayer(one, two, three)) {
			winner = one.getPlayer();

			if(winner !=0){
			JOptionPane.showMessageDialog(this, "Player " + one.getPlayer()
					+ " wins!");
			this.reset();
			}
		}
		
		 one = tiles[2][0];
		 two = tiles[2][1];
		 three = tiles[2][2];
		 
		 if (samePlayer(one, two, three)) {
			winner = one.getPlayer();

			if(winner !=0){
			JOptionPane.showMessageDialog(this, "Player " + one.getPlayer()
					+ " wins!");
			this.reset();
			}
		}
		 
		// check vertical

			 one = tiles[0][0];
			 two = tiles[1][0];
			 three = tiles[2][0];
			if (samePlayer(one, two, three)) {
				winner = one.getPlayer();

				if(winner !=0){
				JOptionPane.showMessageDialog(this, "Player " + one.getPlayer()
						+ " wins!");
				this.reset();
				}
			}
			
			 one = tiles[0][1];
			 two = tiles[1][1];
			 three = tiles[2][1];
			if (samePlayer(one, two, three)) {
				winner = one.getPlayer();

				if(winner !=0){
				JOptionPane.showMessageDialog(this, "Player " + one.getPlayer()
						+ " wins!");
				this.reset();
				}
			}
			
			 one = tiles[0][2];
			 two = tiles[1][2];
			 three = tiles[2][2];
			 
			 if (samePlayer(one, two, three)) {
				winner = one.getPlayer();

				if(winner !=0){
				JOptionPane.showMessageDialog(this, "Player " + one.getPlayer()
						+ " wins!");
				this.reset();
				}
			}
			 
			 
				// check diags

			 one = tiles[0][0];
			 two = tiles[1][1];
			 three = tiles[2][2];
			if (samePlayer(one, two, three)) {
				winner = one.getPlayer();

				if(winner !=0){
				JOptionPane.showMessageDialog(this, "Player " + one.getPlayer()
						+ " wins!");
				this.reset();
				}
			}
			
			 one = tiles[0][2];
			 two = tiles[1][1];
			 three = tiles[2][0];
			if (samePlayer(one, two, three)) {
				winner = one.getPlayer();

				if(winner !=0){
				JOptionPane.showMessageDialog(this, "Player " + one.getPlayer()
						+ " wins!");
				this.reset();
				}
			}
		 
	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent ae) {

			Tile button = (Tile) ae.getSource();

			if (turn == 1) {
				button.setImage(player1);
				button.setPlayer(1);
				// button.setBackground(Color.red);
				turn = 2;
			} else {
				button.setImage(player2);
				button.setPlayer(2);
				// button.setBackground(Color.blue);
				turn = 1;
			}

			/* do all the tic tac toe rule magic */
			checkTicTacToe();
		}
	}

}
