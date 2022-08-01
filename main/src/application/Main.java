package application;

import java.util.Scanner;

import entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();

		System.out.println("Insira a altura e a largura do retangulo: ");
		retangulo.setAltura(sc.nextDouble());
		retangulo.setLargura(sc.nextDouble());

		System.out.println(retangulo.toString());
		
		System.out.println(String.format("%.3f", retangulo.getAltura()));
		sc.close();

	}

}
