import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private Tile[][] tiles;

	public GameBoard() {
		rows = 3;
		cols = 3;
		tiles = new Tile[rows][cols];

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
		for(int i =0; i < rows; i++){
			for(int j =0; j < cols; j++){
				tiles[i][j].setIcon(null);	
				
			}
		}

	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent ae) {
			
			
			/*do all the tic tac toe rule magic*/
		}
	}

}
