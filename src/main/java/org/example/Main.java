package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o valor de A: ");
        double a = entrada.nextDouble();


        System.out.println("Digite o valor de B: ");
        double b = entrada.nextDouble();


        double c = a;
        a = b;
        b = c;


        System.out.println("Novo valor de A: " + a);
        System.out.println("Novo valor de B: " + b);

    }
}
