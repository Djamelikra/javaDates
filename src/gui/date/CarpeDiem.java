package gui.date;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class CarpeDiem {
	
	public void currentFullDate() {
		SimpleDateFormat cfd = new SimpleDateFormat("EEEE dd MMMM yyyy k:mm:ss (SS)");
		String sCfd = cfd.format(new Date());
		
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, sCfd, "currentFullDate", 1);
		
		
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		CarpeDiem cd = new CarpeDiem();
		cd.currentFullDate();
				

	}

}
