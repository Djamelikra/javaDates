package simple.date;

import java.awt.Toolkit;
import java.time.Duration;
import java.time.Instant;
import javax.swing.JOptionPane;

public class TimeCalculus {
	
	
	public void timeElapsed() {
		Instant start = Instant.now();
//		runAlgorithm();
		JOptionPane.showMessageDialog(null,"runAlgorithm(...)", "Calc" , 1); 
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		long millis = timeElapsed.toMillis();
		long nanos = timeElapsed.toNanos();
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, String.valueOf(millis), "Miliseconds" , 1); 
		JOptionPane.showMessageDialog(null, String.valueOf(nanos), "Nanoseconds" , 1); 
		
		
	}
	
	

	public static void main(String[] args) {
		TimeCalculus tc = new TimeCalculus();
		tc.timeElapsed();
		

	}

}
