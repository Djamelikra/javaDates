package simple.date;

import java.time.ZonedDateTime;

public class TimeZone {

	public void tryTimeZone() {
		System.out.println(ZonedDateTime.now());

		System.out.println("Get current timezone " + ZonedDateTime.now().getZone());

		System.out.println("Get time of different timezone: " + ZonedDateTime.now(ZoneId.of("America/New_York")));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
