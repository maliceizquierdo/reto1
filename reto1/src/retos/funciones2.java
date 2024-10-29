package retos;

public class funciones2 {

	public static int multiplicar(int n1, int n2) {
		int n3 = n1 * n2;
		return n3;
	}

	public static int dividir(int n1, int n2) {
		
		int n3 = n1 / n2;
		if(n2==0) {
			return 0;
		}
		return n3;
	}

	public static void esPositivo(int n1) {

		if (n1 > 0) {
			System.out.println("Positivo");
		}

	}

	public static void esNegatico(int n1) {

		if (n1 < 0) {
			System.out.println("Negativo");
		}
	}

}
