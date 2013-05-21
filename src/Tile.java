import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Tile extends JButton {

	/**
	 * @param args
	 */
	private ImageIcon icon;
	private int xLoc;
	private int yLoc;
	private int player;

	public Tile() {
		setBackground(Color.WHITE);

	}

	public void setImage(ImageIcon img) {
		icon = img;
		this.setIcon(icon);
	}
	
	
	public void setPlayer(int id){
		player = id;
	}
	
	public int getPlayer(){
		return player;
	}

	public int getXLoc() {
		return xLoc;
	}
	public void setXLoc(int x){
		xLoc = x;
	}

	public int getYLoc() {
		return yLoc;
	}
	
	public void setYLoc(int y){
		yLoc = y;
	}

	public String getIconName() {

		return icon.toString();
	}
}