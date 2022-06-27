package gui.date;

import java.awt.Toolkit;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;



/**
 * @author Djamel
 *
 */
public class CurrentDate {

	/**
	 * use a JTextArea in a dialog box
	 */
	public void display() {
		JTextArea display = new JTextArea(10, 30);
		String texte = "nombre\tdouble\tquart\n";

		for (int i = 1; i < 7; i++) {
			int val1 = i * 2;
			double val2 = i / 4.0;
			texte += "\n" + i + "\t" + val1 + "\t" + val2;
		}

		display.setText(texte);
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, display, "Numbers List:", -1); // PLAIN_MESSAGE

//		System.exit(0);

	}

	/**
	 * avoid using a String variable for the content of a JTextArea
	 */
	public void displayV2() {

		JTextArea display = new JTextArea(10, 30);

		display.append("nombre\tdouble\tquart\n");
//		String texte = "nombre\tdouble\tquart\n";

		for (int i = 1; i < 7; i++) {
			int val1 = i * 2;
			double val2 = i / 4.0;
			display.append("\n" + i + "\t" + val1 + "\t" + val2);
//			texte += "\n" + i + "\t" + val1 + "\t" + val2;
		}

//		display.setText(texte);
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, display, "Numbers List V2:", -1); // PLAIN_MESSAGE

		System.exit(0);

	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		CurrentDate cr = new CurrentDate();
		cr.display();
		cr.displayV2();
	}

}
