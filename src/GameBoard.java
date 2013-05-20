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
public class GameBoard {
	
	private int rows;
	private int cols;

	public GameBoard() {
rows = 3;
cols = 3;
	}

	@SuppressWarnings("unused")
	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent ae) {
		}
	}

}
