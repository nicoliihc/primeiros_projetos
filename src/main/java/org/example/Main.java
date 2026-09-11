package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o valor do salário do cliente? ");
        double salario = entrada.nextDouble();
        System.out.println("Qual é o valor da parcela desejada? ");
        double parcela = entrada.nextDouble();

        double porc = (salario/100) * 30;

        if (parcela <= porc){
            System.out.println("O empréstimo foi aprovado");
        }else{
            System.out.println("O empréstimo foi recusado");
        }

    }
}
