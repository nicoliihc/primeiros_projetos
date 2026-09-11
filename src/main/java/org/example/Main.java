package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite o capital inicial: ");
        double C = entrada.nextDouble();


        System.out.print("Digite a taxa de juros mensal em %: ");
        double i = entrada.nextDouble();


        System.out.print("Digite o tempo em meses: ");
        int t = entrada.nextInt();


        double porcentagem = i / 100;
        double juros = C * porcentagem * t;
        double montante = C + juros;


        System.out.printf("Juros gerados: R$" + juros + "\n");
        System.out.printf("Montante final: R$" + montante);

    }
}
