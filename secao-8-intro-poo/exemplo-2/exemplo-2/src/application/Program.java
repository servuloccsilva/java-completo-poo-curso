package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Enter the name of the product");
		product.name = sc.next();
		
		System.out.println("Enter the price of the product");
		product.price = sc.nextDouble();
		
		System.out.println("Enter the quantity in stock");
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		
		System.out.println("Add products");
		product.addProducts(sc.nextInt());
		
		System.out.println(product);
		
		System.out.println("Remove products");
		product.removeProducts(sc.nextInt());
		
		System.out.println(product);
		
		
		
		
		
		sc.close();

	}

}
