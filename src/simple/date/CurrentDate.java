package simple.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

	public void currDate() {
		SimpleDateFormat dtUSeDate = new SimpleDateFormat("dd/MM/yyy");
		System.out.println("Date: " + dtUSeDate.format(new Date()));
	}

	public void milisecondesDate() {
		// On récupère le nombre de millisecondes écoulées depuis le 1er janvier 1970 à
		// minuit.
		long timestampMS = System.currentTimeMillis();
		// On régénère une instance de Date associée à ce timestamp.
		Date now = new Date(timestampMS); // Equivalent à : Date now = new Date();

		// On considère le timestamp 0 et la date associée
		long timestampBase = 0;
		Date base = new Date(timestampBase);

		// On affiche les données calculées.
		System.out.printf("Nombre de milliseconds écoulée depuis %s : %d\n", base, timestampMS);
		System.out.printf("Nous sommes le %s\n", now);

	}

	public static void main(String[] args) {
		CurrentDate cd = new CurrentDate();
		cd.currDate();
		cd.milisecondesDate();

	}

}
