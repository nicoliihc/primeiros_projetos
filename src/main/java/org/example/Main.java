package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o valor do lado do quadrado: ");
        double lado = entrada.nextDouble();


        double area = lado * lado ;


        System.out.println("A área do quadrado é: " + area);

    }
}
