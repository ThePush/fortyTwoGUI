package fortyTwoGUI;

import java.awt.event.*;
import java.io.*;
import java.awt.*;

import javax.swing.*;

public class fortyTwoGUI {

	MyButton b1 = new MyButton();
	MyButton b2 = new MyButton();
	MyButton b3 = new MyButton();

	public void TrackButton() {

		ImageIcon icon = new ImageIcon("/assets/discord.png");

		b1.setText("Discord");
		b1.setBounds(50, 300, 200, 50);
		b1.setIcon(icon);
		b1.addActionListener(actions);

		b2.setText("Beta");
		b2.setBounds(50, 360, 200, 50);
		b2.addActionListener(actions);
		
		b3.setText("Exit");
		b3.setBounds(50, 420, 200, 50);
		b3.addActionListener(actions);

		MyFrame frame = new MyFrame();
		MyLabel label = new MyLabel();
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(label);
		frame.setVisible(true);

	}

	private ActionListener actions = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b1) {
				try {
					msg_button1();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			} else if (e.getSource() == b2) {
				b2.setBackground(Color.gray);
				msg_button2();
			} else if (e.getSource() == b3){
				System.exit(0);
			}
		}
	};

	public void msg_button1() throws IOException {
		Process process = new ProcessBuilder("/usr/share/discord/Discord").start();
		InputStream is = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}

	public void msg_button2() {
		JOptionPane.showMessageDialog(null, "Beta");
		b2.setBackground(Color.black);

	}

	public static void main(String[] args) {
		fortyTwoGUI jb = new fortyTwoGUI();
		jb.TrackButton();
	}
}