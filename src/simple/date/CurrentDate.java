package simple.date;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		 
		String formattedDate = formatter.format(LocalDate.now());
		System.out.println(formattedDate);
	}


	public static void main(String[] args) {
		CurrentDate cd = new CurrentDate();
		cd.tryDate();
		cd.currDate();
		

	}

}
