import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GamePanel extends JPanel {

	GameBoard board;
	JButton reset;

	JRadioButton imgP1;
	JRadioButton imgP2;

	ImageIcon p1icon;
	ImageIcon p2icon;
	JComboBox tomerList;
	String[] tomerStrings = { "tomercoding", "tomercrossarmed",
			"tomerfunnyface", "tomermain", "tomerscarf" };

	public GamePanel() {
		setLayout(new BorderLayout());

		ButtonListener bListen = new ButtonListener();
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		board = new GameBoard();
		reset = new JButton("RESET");
		reset.addActionListener(bListen);
		imgP1 = new JRadioButton("Change Player 1 Image");
		imgP1.addActionListener(bListen);
		imgP2 = new JRadioButton("Change Player 2 Image");
		imgP2.addActionListener(bListen);

		// Create the combo box, select item at index 4.
		// Indices start at 0, so 4 specifies the pig.
		tomerList = new JComboBox(tomerStrings);
		tomerList.setSelectedIndex(3);
		tomerList.addActionListener(bListen);

		panel.add(imgP1, BorderLayout.EAST);
		panel.add(imgP2, BorderLayout.WEST);

		panel.add(reset, BorderLayout.NORTH);
		panel.add(tomerList, BorderLayout.SOUTH);
		add(panel, BorderLayout.SOUTH);
		add(board, BorderLayout.NORTH);
	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent ae) {

			if (ae.getSource() == reset) {
				board.reset();
			}

			if (ae.getSource() == tomerList) {

				JComboBox cb = (JComboBox) ae.getSource();
				String tomerPicName = (String) cb.getSelectedItem();

				if (imgP1.isSelected()) {
					p1icon = new ImageIcon(tomerPicName);
					board.setPlayer1Icon(p1icon);

				}
				if (imgP2.isSelected()) {
					p2icon = new ImageIcon(tomerPicName);
					board.setPlayer2Icon(p2icon);

				}

			}

		}
	}

}
