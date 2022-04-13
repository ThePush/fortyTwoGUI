package mainjava;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public class MyButton extends JButton {

	MyButton() {
		this.setForeground(Color.white);
		this.setFocusable(false);
		this.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.white, Color.gray));
		this.setBackground(Color.black);
	}
}
