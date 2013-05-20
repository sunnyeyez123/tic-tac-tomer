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
	
public Tile(){
	setBackground(Color.WHITE);
	
}


public void setImage(ImageIcon img){
	icon = img;
	this.setIcon(icon);	
}


public int getXLoc(){
	return xLoc;
}

public int getYLoc(){
	return yLoc;
}

public String getIconName(){
	
	return icon.toString();
}
}