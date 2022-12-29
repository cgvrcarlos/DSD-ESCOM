package ejerclases;

import java.util.concurrent.ThreadLocalRandom;

public class Clase5 {
	public static void main(String[] args) {

		int total = 0;
		int find = 0;

		int n_tokens = Integer.parseInt(args[0]);

		char [] cadena = new char[4 * n_tokens];

		
		for (int i = 0; i < cadena.length; i += 4) {
			
			cadena[i] = (char) ThreadLocalRandom.current().nextInt(65, 90 + 1);

			cadena[i + 1] = (char) ThreadLocalRandom.current().nextInt(65, 90 + 1);

			cadena[i + 2] = (char) ThreadLocalRandom.current().nextInt(65, 90 + 1);

			cadena[i + 3] = ' ';
		}


		for (int i = 0; i < cadena.length; i += 4) {

			find = (cadena[i] == 'I') ? 1 : 0;

			find = (cadena[i] == 'P') ? 1 : 0;

			find = (cadena[i] == 'N') ? 1 : 0;

			total = total + find;

		}

		System.err.println("Se encontraron " + total + " coincidencias de IPN");

	}
}