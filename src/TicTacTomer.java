import javax.swing.JFrame;
import javax.swing.UIManager;

public class TicTacTomer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// start ugly hack to get button colors on Macs.  Approved by Andrew Ash
		try {
		    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
		    e.printStackTrace();
		}
		// end ugly hack
		// TODO Auto-generated method stub
		
		GamePanel panel = new GamePanel();
		JFrame frame = new JFrame("Tic-Tac-Tomer!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
