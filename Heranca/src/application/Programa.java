package application;

import entites.Conta;
import entites.ContaCorporativa;
import entites.ContaPoupanca;

public class Programa {
    public static void main (String[] args){

        Conta c = new Conta(1001, "Alex ", 0.0);
        ContaCorporativa cc = new ContaCorporativa(1002, "Maria", 0.0, 500.0);

        //Upcasting
        Conta c1 = cc;
        Conta c2 = new ContaCorporativa(1003, "Bob", 0.0, 200.0);
        Conta c3 = new ContaPoupanca(1004, "Ana", 0.0, 0.01);

        //Downcasting
        ContaCorporativa c4 = (ContaCorporativa) c2;                    //Casting manual
        c4.emprestimo(100.0);

        //Forçando erro
        //ContaCorporativa c5 = (ContaCorporativa) c3;
        if (c3 instanceof ContaCorporativa){
            ContaCorporativa c5 = (ContaCorporativa) c3;
            c5.emprestimo(200.0);
            System.out.println("Empréstimo!");
        }

        if (c3 instanceof ContaPoupanca){
            ContaPoupanca c5 = (ContaPoupanca) c3;
            c5.atualizaSaldo();
            System.out.println("Atualizado!");
        }

        //-------------------------------------------
        //Estudando anotação Override e super

        Conta conta1 = new Conta(1010, "João", 1000.0);
        conta1.saque(200.0);
        System.out.println(conta1.getSaldo());

        Conta conta2 = new ContaPoupanca(1020, "Cleiton", 1000.0, 0.01);
        conta2.saque(200.0);
        System.out.println(conta2.getSaldo());

        Conta conta3 = new ContaCorporativa(1030, "Júlia", 1000.0, 500.0);
        conta3.saque(200.0);
        System.out.println(conta3.getSaldo());
    }
}
