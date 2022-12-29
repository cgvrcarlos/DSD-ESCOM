package ejerclases;

import java.util.concurrent.ThreadLocalRandom;

public class Clase52 {
	public static void main(String[] args) {

		long timeStart, timeEnd;

		int total = 0;

		int n_tokens = Integer.parseInt(args[0]);

		String token = "IPN";

		StringBuilder cadena = llenarArreglo(n_tokens);

		timeStart = System.nanoTime();

		total = encontrarCadena(token, cadena, n_tokens);

		timeEnd = System.nanoTime();

		System.err.println("Se encontraron " + total + " coincidencias de IPN");
		System.out.println("La busqueda tardo " + (timeEnd - timeStart) + " Nanosegundos");
	}

	public static int encontrarCadena(String p, StringBuilder cad, int n) {
        int total = 0;
        int flag = 0;
        
		while ((flag = cad.indexOf(p, flag)) != -1){
            flag += 4;
            total++;
        }

        return total;
    }

	public static StringBuilder llenarArreglo(int n) {
        StringBuilder cad = new StringBuilder();
        for (int i = 0, j = 0; i < (n * 4); i++) {
            if (j == 3) {
                cad.append(" ");
                j = 0;
            }else {
                cad.append(generaLetra());
                j++;
            }
        }
        return cad;
    }

	public static char generaLetra() {
        return (char) ThreadLocalRandom.current().nextInt(65, 90 + 1);
    }
}