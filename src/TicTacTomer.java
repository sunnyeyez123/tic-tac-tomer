import javax.swing.JFrame;

public class TicTacTomer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Tic-Tac-Tomer!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GamePanel panel = new GamePanel();
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
