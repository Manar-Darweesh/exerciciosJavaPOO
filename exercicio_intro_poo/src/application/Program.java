package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre com as medidas do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println("Area do triangulo X: " + areaX);
		System.out.println("Area do triangulo Y: " + areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior area eh do triangulo X");
		}
		else {
			System.out.println("Maior area eh do triangulo Y");
		}
		
		
		sc.close();
	}

}
