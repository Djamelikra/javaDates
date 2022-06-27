package gui.date;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class CarpeDiem {
	
	public void currentFullDate() {
		SimpleDateFormat cfd = new SimpleDateFormat("EEEE dd MMMM yyyy k:mm:ss");
		String sCfd = cfd.format(new Date());
		
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, sCfd, "currentFullDate",  1, new ImageIcon("icons/eu.png"));
	}
	

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		CarpeDiem cd = new CarpeDiem();
		cd.currentFullDate();
				

	}

}
