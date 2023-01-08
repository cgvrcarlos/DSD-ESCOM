package ejerclase7;

public class Rectangulo extends Figura implements Perimetro {
	private Coordenada superiorIzq, inferiorDer;
	private double alto, ancho;

	public Rectangulo() {
		superiorIzq = new Coordenada(0, 0);
		inferiorDer = new Coordenada(0, 0);

		alto = superiorIzquierda().ordenada() - inferiorDerecha().ordenada();
		ancho = inferiorDerecha().abscisa() - superiorIzquierda().abscisa();
	}

	public Rectangulo(Coordenada superiorIzq, Coordenada inferiorDer) {
		this.superiorIzq = superiorIzq;
		this.inferiorDer = inferiorDer;

		alto = superiorIzquierda().ordenada() - inferiorDerecha().ordenada();
		ancho = inferiorDerecha().abscisa() - superiorIzquierda().abscisa();
	}

	public Rectangulo(double xSupIzq, double ySupIzq, double xInfDer, double yInfDer) {
		superiorIzq = new Coordenada(xSupIzq, ySupIzq);
		inferiorDer = new Coordenada(xInfDer, yInfDer);

		alto = superiorIzquierda().ordenada() - inferiorDerecha().ordenada();
		ancho = inferiorDerecha().abscisa() - superiorIzquierda().abscisa();
	}

	// Metodo getter de la coordenada superior izquierda
	public Coordenada superiorIzquierda() { return superiorIzq; }

	// Metodo getter de la coordenada inferior derecha
	public Coordenada inferiorDerecha() { return inferiorDer; }

	@Override
	public double area() {
		return alto * ancho;
	}

	@Override
	public double perimetro() {
		return (alto * 2) + (ancho * 2);
	}

	//Sobreescritura del método de la superclase objeto para imprimir con System.out.println()
	@Override
	public String toString() {
		return "Esquina Superior Izquierda: " + superiorIzq + "\tEsquina Superior Derecha: " + inferiorDer + "\n";
	}
}
