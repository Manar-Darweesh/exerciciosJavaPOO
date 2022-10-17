package application;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        System.out.println("Digite quantos produtos deseja: ");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Informações do " + i + "# produto: ");
            System.out.print("Produto comum, usado ou importado? (c/u/i)");
            Character ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Preço: ");
            Double preco = sc.nextDouble();
            if (ch == 'c'){
                list.add(new Produto(nome,preco));
            } else if (ch == 'u') {
                Date date = new Date();
                list.add(new ProdutoUsado(nome, preco, date));
            } else if (ch == 'i') {
                System.out.print("Taxa da alfandega: ");
                Double taxaAlfandega = sc.nextDouble();
                list.add(new ProdutoImportado(nome, preco, taxaAlfandega));
            }
        }

        System.out.println();
        System.out.println("Etiquetas dos preços");

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }


        sc.close();
    }
}
