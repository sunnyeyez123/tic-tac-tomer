import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GamePanel extends JPanel {

	GameBoard board;
	JButton reset, imgP1, imgP2;
	ImageIcon p1icon;
	ImageIcon p2icon;
	private JFileChooser chooser;

	public GamePanel() {
		setLayout(new BorderLayout());

		ButtonListener bListen = new ButtonListener();
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		board = new GameBoard();
		reset = new JButton("RESET");
		reset.addActionListener(bListen);
		imgP1 = new JButton("Change Player 1 Image");
		imgP1.addActionListener(bListen);
		imgP2 = new JButton("Change Player 2 Image");
		imgP2.addActionListener(bListen);

		chooser = new JFileChooser();

		panel.add(imgP1, BorderLayout.EAST);
		panel.add(imgP2, BorderLayout.WEST);

		panel.add(reset, BorderLayout.NORTH);
		add(panel, BorderLayout.SOUTH);
		add(board, BorderLayout.NORTH);
	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent ae) {

			if (ae.getSource() == reset) {
				board.reset();
			}

			if (ae.getSource() == imgP1) {
				int returnVal = chooser.showOpenDialog(null);

				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = chooser.getSelectedFile();
					String name = file.getAbsolutePath();
					p1icon = new ImageIcon(name);
				} else {
					JOptionPane.showMessageDialog(null, "Invalid file type.");
				}
			}

			if (ae.getSource() == imgP2) {
				int returnVal = chooser.showOpenDialog(null);

				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = chooser.getSelectedFile();
					String name = file.getAbsolutePath();
					p2icon = new ImageIcon(name);
				} else {
					JOptionPane.showMessageDialog(null, "Invalid file type.");
				}
			}

		}
	}

}
