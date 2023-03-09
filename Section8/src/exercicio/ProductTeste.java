package exercicio;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProductTeste {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();
		
		System.out.println("Enter a product data: ");
		System.out.print("Name: ");
		p.name = sc.nextLine();
		
		System.out.print("Price: ");
		p.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		p.quantity = sc.nextInt();
		
		System.out.println("Product data: " + p);
		
		System.out.print("Enter the number of products to be added in stock: ");
		int add = sc.nextInt();
		p.AddProducts(add);
		System.out.println("Update data: " + p);
		
		System.out.print("Enter the number of products to be remove in stock: ");
		int rm = sc.nextInt();
		p.RemoveProducts(rm);
		System.out.println("Update data: " + p);
		sc.close();


	}

}
