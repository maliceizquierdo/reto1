package retos;

public class funciones1 {
	public static int sumar(int a, int b) {
		int c;
		c= a + b;
		return c;
	}
	public static int restar(int a, int b) {
		int c;
		c=a-b;
		return c;
	}
	public static void par(int a) {
		if(a%2==0) {
			System.out.println("Es par");
		}
	}
	public static void impar(int a) {
		if(a%2!=0) {
			System.out.println("Es impar");
		}
	}
}
