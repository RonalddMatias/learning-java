package exercicio;


import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class RetangleTeste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangle r = new Retangle();
		
		System.out.println("Enter rectangle width and height: ");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		
		System.out.println(r);
		sc.close();

	}

}
