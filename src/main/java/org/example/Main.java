package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite a temperatura em graus celsius: ");
        double C = entrada.nextDouble();


        double F = ( C * 9/5) + 32;


        System.out.println("A temperatura em Fahrenheit é: " + F);


    }
}
