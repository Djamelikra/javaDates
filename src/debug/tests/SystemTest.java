package debug.tests;

public class SystemTest {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {

			if (i == 5) {
				// On sort définitivement du programme.
				System.exit(-1);
			}

			System.out.println("Un nouveau tour de boucle avec : " + i);
		}

		// Cette ligne ne sera jamais exécutée, car on stoppe le programme
		// avant la fin de la boucle.
		System.out.println("Bye bye");

	}

}
