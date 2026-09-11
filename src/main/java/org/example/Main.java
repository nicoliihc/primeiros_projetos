package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite um valor em reais: ");
        double reais = entrada.nextDouble();


        double dolar = reais * 5.11;


        System.out.println("O valor convertido em dólares é: " + dolar + "$");

    }
}
