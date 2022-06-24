package simple.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {
	
	
	public void currDate() {
		SimpleDateFormat dtUSeDate = new SimpleDateFormat("dd/MM/yyy");
		System.out.println("Date: " + dtUSeDate.format(new Date()));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		CurrentDate cd = new CurrentDate();
		cd.currDate();
		
		
		

	}

}
