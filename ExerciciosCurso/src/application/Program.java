package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++){
            double altura = sc.nextDouble();
            vect[i] = altura;
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++){
            soma += vect[i];
        }

        System.out.printf("Altura média: %2f%n", soma/n);

        sc.close();
    }
}
