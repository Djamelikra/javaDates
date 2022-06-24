package simple.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

	public void currDate() {
		SimpleDateFormat dtUSeDate = new SimpleDateFormat("dd/MM/yyy");
		System.out.println("Date: " + dtUSeDate.format(new Date()));
	}

	public void milisecondesDate() {
		// On r�cup�re le nombre de millisecondes �coul�es depuis le 1er janvier 1970 �
		// minuit.
		long timestampMS = System.currentTimeMillis();
		// On r�g�n�re une instance de Date associ�e � ce timestamp.
		Date now = new Date(timestampMS); // Equivalent � : Date now = new Date();

		// On consid�re le timestamp 0 et la date associ�e
		long timestampBase = 0;
		Date base = new Date(timestampBase);

		// On affiche les donn�es calcul�es.
		System.out.printf("Nombre de milliseconds �coul�e depuis %s : %d\n", base, timestampMS);
		System.out.printf("Nous sommes le %s\n", now);

	}

	public static void main(String[] args) {
		CurrentDate cd = new CurrentDate();
		cd.currDate();
		cd.milisecondesDate();

	}

}
