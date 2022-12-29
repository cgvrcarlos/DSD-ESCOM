package ejerclase6;


public class PruebaRectangulo {
	public static void main(String[] args) {
		Rectangulo rec1 = new Rectangulo(2, 3, 5, 1);

		double ancho, alto;

		long timeStart, timeEnd;

		System.out.println("Calculando el área de un rectángulo dadas sus coordenadas en un plano cartesiano:");
		System.out.println(rec1);

		alto = rec1.superiorIzquierda().ordenada() - rec1.inferiorDerecha().ordenada();
		ancho = rec1.inferiorDerecha().abscisa() - rec1.superiorIzquierda().abscisa();

		System.out.println("El area del rectangulo es = " + ancho * alto);

		// Creando Poligono Irregular con new
		timeStart = System.nanoTime();
		PoligonoIrregular pol1 = new PoligonoIrregular(10000000, true);
		timeEnd = System.nanoTime();

		System.out.println("La creacion con new tardo " + (timeEnd - timeStart) + " nanosegundos");

		// Creando Poligono Irregular con setter
		timeStart = System.nanoTime();
		PoligonoIrregular pol2 = new PoligonoIrregular(10000000, false);
		timeEnd = System.nanoTime();

		System.out.println("La creacion con setter tardo " + (timeEnd - timeStart) + " nanosegundos");
	}
}
