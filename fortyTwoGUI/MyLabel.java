package fortyTwoGUI;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyLabel extends JLabel {

	ImageIcon image = new ImageIcon("assets/42_logo.png");

	MyLabel() {
		this.setIcon(image);
		this.setForeground(Color.white);;
		this.setBackground(Color.black);
		this.setOpaque(true);
		this.setText("42 random GUI");
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setVerticalTextPosition(JLabel.BOTTOM);
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setVerticalAlignment(JLabel.CENTER);
		this.setFont(new Font(null, Font.ITALIC, 20));
		this.setPreferredSize(new Dimension(0, 0));
		Border border = BorderFactory.createLineBorder(Color.WHITE);
		this.setBorder(border);
		this.setIconTextGap(-30);
		this.setBounds(50, 10, 200, 200);
	}	
}
