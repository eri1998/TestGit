package TestHeroku.JavaClass;

import javax.swing.JFrame;
import javax.swing.JButton;

public class GuiForma extends JFrame {
	public GuiForma() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("TVOJA GRESKA JE");
		btnNewButton.setBounds(145, 114, 185, 21);
		getContentPane().add(btnNewButton);
	}
}
