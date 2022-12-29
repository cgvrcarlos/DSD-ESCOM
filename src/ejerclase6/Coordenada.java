package ejerclase6;

public class Coordenada {
	private double x, y;

	public Coordenada(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Metodo getter de x
	public double abscisa() { return x; }

	// Metodo getter de y
	public double ordenada() { return y; }

	public void setAbscisa(double x) {
		this.x = x;
	}

	public void setOrdenada(double y) {
		this.y = y;
	}
	 
	//Sobreescritura del método de la superclase objeto para imprimir con System.out.println()
	@Override
	public String toString() {
		return "[" + x + "," + y + "]";
	}
}
