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
	public static boolean par(int a) {
		if(a%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean impar(int a) {
		if(a%2!=0) {
			return true;
		}
		else {
			return false;
		}
	}
}
