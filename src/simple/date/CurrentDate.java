package simple.date;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class CurrentDate {

	public void tryDate() {
		SimpleDateFormat formDate = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, formDate.format(new Date()), "tryDate:", 1);

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

		String sDate = dtfDate.format(LocalDateTime.now());
		StringBuilder sb = new StringBuilder(sDate);
		String sTime = dtfHour.format(LocalDateTime.now());
		sb.append(" ");
		sb.append(sTime);
		sb.append(" ☺");

		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, sb, "Date & time :", 1);
	}

	public void dtCalendar() {

		String sDtDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, sDtDate, "Calendar", 1);
	}

	public void nuncLocalDate() {
	LocalDate nuncDate = LocalDate.now();
	int curYear = nuncDate.getYear();
		System.out.println(nuncDate);
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, nuncDate , Integer.toString(curYear) , 1); // variant
		JOptionPane.showMessageDialog(null, nuncDate, String.valueOf(curYear), 1);

	}
	
	public void nuncCalendar() {
		Calendar nuncal = Calendar.getInstance();
		

		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, nuncal.get(Calendar.YEAR) , "Year" , 1); 
		JOptionPane.showMessageDialog(null, nuncal.get(Calendar.MONTH), "MONTH" , 1);
		JOptionPane.showMessageDialog(null, nuncal.get(Calendar.DAY_OF_MONTH), "DAY_OF_MONTH" , 1);

	}

	public static void main(String[] args) {
		CurrentDate cd = new CurrentDate();
//		cd.tryDate();
//		cd.currDate();
//		cd.dateFormatter();
//		cd.dtCalendar();
//		cd.nuncLocalDate();
		cd.nuncCalendar();
		
		
		
		

	}

}
