package simple.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class MeridianZone {

	public void allZonesId() {
		Set<String> allZones = ZoneId.getAvailableZoneIds();
		
		// create ArrayList from Set
		List<String> zoneList = new ArrayList<String>(allZones);
		Collections.sort(zoneList);
		
		// printing first 10 zoneid with offset
			//Obtains the current date-time from the system clock in the default time-zone. 
		LocalDateTime dtLoc = LocalDateTime.now(); 
		for (int i = 0; i < 10; i++) {
			// get zoneid then ZonedDateTime and offset from that ZoneId
			String sItem = zoneList.get(i);
			ZoneId meridianId = ZoneId.of(sItem);
			ZonedDateTime zonedDate = dtLoc.atZone(meridianId);
			ZoneOffset offset = zonedDate.getOffset();
			System.out.println("ZoneId = " + meridianId +  " offset = " +  offset );
			
		}

	}

	public static void main(String[] args) {
		MeridianZone mz = new MeridianZone();
		mz.allZonesId();
		
				

	}

}
