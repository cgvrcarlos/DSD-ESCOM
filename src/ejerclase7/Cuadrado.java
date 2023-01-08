package ejerclase7;

public class Cuadrado extends Figura implements Perimetro {
	private double ladoLen;

	public Cuadrado(double ladoLen) {
		this.ladoLen = ladoLen;
	}

	public double getLadoLen() { return ladoLen; }

	@Override
	public double area() {
		return ladoLen * ladoLen;
	}

	@Override
	public double perimetro() {
		return ladoLen * 4;
	}

}
