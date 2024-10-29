package retos;

import java.util.Scanner;

import retos.funciones1;
import retos.funciones2;

public class reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		int n1=0;
		int n2=0;
		do
		{
			try
			{
				System.out.println("Introduce un nº:");
				System.out.println("1. Sumar");
				System.out.println("2. Restar");
				System.out.println("3. Par");
				System.out.println("4. Impar");
				System.out.println("5. Multiplicar");
				System.out.println("6. Dividir");
				System.out.println("7. Positivo");
				System.out.println("8. Negativo");
				System.out.println("9. Multiplo 7");
				System.out.println("10. Primer divisor");
				System.out.println("11. Mayor que 20 si es par");
				System.out.println("0. Salir");
				String s = sc.nextLine();
				n=Integer.parseInt(s);
				if(n==1) {
					System.out.println("introduce 2 numeros ");
					String s1 = sc.nextLine();
					n1=Integer.parseInt(s1);
					String s2= sc.nextLine();
					n2=Integer.parseInt(s2);
					int suma= funciones1.sumar(n1, n2);
					System.out.println(suma);
					System.out.println();
				}
				if(n==2) {
					System.out.println("introduce 2 numeros ");
					String s1 = sc.nextLine();
					n1=Integer.parseInt(s1);
					String s2= sc.nextLine();
					n2=Integer.parseInt(s2);
					int resta= funciones1.restar(n1, n2);
					System.out.println(resta);
					System.out.println();
					
				}
				if(n==3) {
					System.out.println("Introduce un numero ");
					String s1 = sc.nextLine();
					n1=Integer.parseInt(s1);
					
					
				}
			}
			catch(Exception ex)
			{
				System.out.println("Introduce un nº correcto");
			}
		}while(n1!=0);


	}

}
