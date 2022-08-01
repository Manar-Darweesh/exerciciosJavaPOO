package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity: ");
		product.quant = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quant = sc.nextInt();
		product.addProduct(quant);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quant =sc.nextInt();
		product.removeProduct(quant);
				
		System.out.println();
		System.out.println("Update data: " + product);
		
		sc.close();
	}

}
