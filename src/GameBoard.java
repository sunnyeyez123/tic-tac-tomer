import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
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
		setPreferredSize(new Dimension(400,400));
		ButtonListener bListen = new ButtonListener();


		for(int i =0; i < rows; i++){
			for(int j =0; j < cols; j++){
				tiles[i][j] = new Tile();
				tiles[i][j].addActionListener(bListen);
				tiles[i][j].setXLoc(i); 
				tiles[i][j].setYLoc(j);
				add(tiles[i][j]);	
			}
		}

		
	}
	
	public void reset(){
		turn = 1;
		for(int i =0; i < rows; i++){
			for(int j =0; j < cols; j++){
				tiles[i][j].setImage(null);
				

				
			}
		}

	}
	
	public void setPlayer1Icon(ImageIcon img){
		player1 = img;
	}

	public void setPlayer2Icon(ImageIcon img){
		player2 =img;
	}
	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent ae) {
			
			Tile button = ( Tile )ae.getSource();
			
			if(turn == 1){
				button.setImage(player1);
			//	button.setBackground(Color.red);
				turn =2;
			}else{
				button.setImage(player2);
			//	button.setBackground(Color.blue);
				turn =1;
			}

			/*do all the tic tac toe rule magic*/
		}
	}

}
