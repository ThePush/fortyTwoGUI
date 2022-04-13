package fortyTwoGUI;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	ImageIcon image = new ImageIcon("/assets/42_logo.png");

	MyFrame(){
		this.setTitle("42 random GUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 600);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(0x123456));
		this.setResizable(false);

		this.setIconImage(image.getImage());
	}
}
