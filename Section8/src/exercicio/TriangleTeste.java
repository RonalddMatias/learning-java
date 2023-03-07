package exercicio;

import java.util.Locale;

import java.util.Scanner;

import entities.Triangle;

public class TriangleTeste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite as medidas do triângulo x: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medida do triângulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.calcularArea();
		
		double areaY = y.calcularArea();
		
		
		System.out.printf("Triangle X area: %.2f\n", areaX);
		System.out.printf("Triangle Y area: %.2f\n", areaY);
		
		if(areaX > areaY) {
			System.out.printf("Large area: %.2f", areaX);
		} else {
			System.out.printf("Large area: %.2f", areaY);
		}
		
		sc.close();
	}

}
