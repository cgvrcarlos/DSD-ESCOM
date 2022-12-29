package ejerclase6;

import java.util.ArrayList;
public class PoligonoIrregular {

	private ArrayList<Coordenada> vertices;

	public PoligonoIrregular() {
		vertices = new ArrayList<>();
	}

	public PoligonoIrregular(int n, Boolean flag) {
		vertices = new ArrayList<>();

		if (flag) {
			for (int i = 0; i < n; i++) {
				anadeCoordenada(new Coordenada(Math.random(), Math.random()));
			}
		} else {
			Coordenada coo = new Coordenada(0, 0);

			for (int i = 0; i < n; i++) {
				
				coo.setAbscisa(Math.random());
				coo.setOrdenada(Math.random());
				
				anadeCoordenada(coo);
			}
		}
	}

	public void anadeCoordenada(Coordenada coo) {
		this.vertices.add(coo);
	}

	//Sobreescritura del método de la superclase objeto para imprimir con System.out.println()
	@Override
	public String toString() {
		return "Vertices = " + vertices;
	}
}