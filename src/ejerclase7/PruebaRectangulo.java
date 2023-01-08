package ejerclase7;

public class PruebaRectangulo {
	public static void main(String[] args) {
		Coordenada c1 = new Coordenada(2, 3);
        Coordenada c2 = new Coordenada(5, 1);

        Rectangulo rec1 = new Rectangulo(c1, c2);

		Cuadrado cuad1 = new Cuadrado(5);
        
		System.out.println("Calculando el area de un rectangulo dada sus corrdenadas en un plano cartesiano");
        System.out.println(rec1);
        System.out.println("El area del rectangulo es = " + rec1.area());
        System.out.println("El perimetro del rectangulo es = " + rec1.perimetro());

        System.out.println();
        
		System.out.println("Calculando el area de un cuadrado dada la longitud de sus lados");
        System.out.println("Longitud de los Lados = " + cuad1.getLadoLen());
        System.out.println("El area del cuadrado es = " + cuad1.area());
        System.out.println("El perimetro del cuadrado es = " + cuad1.perimetro());
	}
}
