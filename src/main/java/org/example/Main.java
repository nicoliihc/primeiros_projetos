package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o valor da altura do retângulo: ");
        double h = entrada.nextDouble();


        System.out.println("Digite o valor da base do retângulo: ");
        double b = entrada.nextDouble();


        double perimetro = (h * 2) + (b * 2) ;


        System.out.println("O perímetro do retângulo é: " + perimetro);

    }
}
