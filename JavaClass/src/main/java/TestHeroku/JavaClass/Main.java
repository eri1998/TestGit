package TestHeroku.JavaClass;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



public class Main {

	public static void main(String[] args) {
		 try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			GuiForma guiForma = new GuiForma();
			guiForma.setVisible(true);

	}

}
