package ejerclases;

import java.util.concurrent.ThreadLocalRandom;

public class Clase51 {
	public static void main(String[] args) {

		long timeStart, timeEnd;

		int total = 0;
		int match = 0;

		int n_tokens = Integer.parseInt(args[0]);

		char [] cadena = new char[4 * n_tokens];

		
		for (int i = 0; i < cadena.length; i += 4) {
			
			cadena[i] = (char) ThreadLocalRandom.current().nextInt(65, 90 + 1);

			cadena[i + 1] = (char) ThreadLocalRandom.current().nextInt(65, 90 + 1);

			cadena[i + 2] = (char) ThreadLocalRandom.current().nextInt(65, 90 + 1);

			cadena[i + 3] = ' ';
		}

		timeStart = System.nanoTime();

		for (int i = 0; i < cadena.length; i += 4) {

			match = (cadena[i] == 'I') ? 1 : 0;

			match = (cadena[i + 1] == 'P' && match == 1) ? 1 : 0;

			match = (cadena[i + 2] == 'N' && match == 1) ? 1 : 0;

			total = total + match;

		}

		timeEnd = System.nanoTime();

		System.err.println("Se encontraron " + total + " coincidencias de IPN");
		System.out.println("La busqueda tardo " + (timeEnd - timeStart) + " Nanosegundos");
	}
}