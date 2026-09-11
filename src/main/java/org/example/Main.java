package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor em metros: ");
        double m = entrada.nextDouble();


        double cm = m * 100;
        double mm = m * 1000;


        System.out.println("Centímetros: " + cm + "cm");
        System.out.println("Milímetros: " + mm + "mm");



    }
}
