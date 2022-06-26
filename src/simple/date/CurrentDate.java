package simple.date;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.JOptionPane;



public class CurrentDate {


	public void tryDate() {
		SimpleDateFormat formDate = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, formDate.format(new Date()),"tryDate:",1);
	
	}
	
	public void currDate() {
		SimpleDateFormat dtUSeDate = new SimpleDateFormat("dd/MM/yyy");
		System.out.println("Date: " + dtUSeDate.format(new Date()));
	}

	public void dateFormatter() {
		DateTimeFormatter dtfDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dtfDate.format(LocalDateTime.now()));
		DateTimeFormatter dtfHour = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(dtfHour.format(LocalDateTime.now()));
	}
	


	public static void main(String[] args) {
		CurrentDate cd = new CurrentDate();
		cd.tryDate();
		cd.currDate();
		cd.dateFormatter();
		

	}

}
