package simple.date;

import java.awt.Toolkit;
import java.time.Duration;
import java.time.Instant;
import javax.swing.JOptionPane;

public class TimeCalculus {
	
	
	public void timeElapsed() {
		Instant start = Instant.now();
//		runAlgorithm();
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		long millis = timeElapsed.toMillis();
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, String.valueOf(millis), "Calc" , 1); 
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
