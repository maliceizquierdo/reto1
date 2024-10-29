package retos;

import java.util.Scanner;

public class reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		do
		{
			try
			{
				System.out.println("Introduce un nº");
				String s = sc.nextLine();
				n=Integer.parseInt(s);
				break;
			}
			catch(Exception ex)
			{
				System.out.println("Introduce un nº correcto");
			}
		}while(true);


	}

}
