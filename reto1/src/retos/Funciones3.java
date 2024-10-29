package retos;

public class Funciones3 {
	int num1;
	int num2;
	int num3;

	public static boolean multiplo7(int num1) {

		if (num1 % 7 == 0) {
			return true;
		}
		return false;
	}

	public static boolean parmayor20(int num2) {
		if (num2 % 2 == 0 && num2 > 20) {
			return true;
		} else
			return false;

	}

	public static int divisormayor1(int num3) {
		int i = 0;
		for (i = 2; i > num3; i++) {
			if(num3%i==0)
				return i;
		}
		return 0;
	}
}
