package mainjava;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	MyFrame(){
		this.setTitle("42 random GUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 600);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(0x123456));
		this.setResizable(false);

		ImageIcon image = new ImageIcon("42_logo.png");
		this.setIconImage(image.getImage());
	}
}
