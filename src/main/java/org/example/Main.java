package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite seu peso (kg): ");
        double peso = entrada.nextDouble();


        System.out.print("Digite sua altura (ex: 1.75): ");
        double altura = entrada.nextDouble();


        double imc = peso / (altura * altura);


        System.out.println("Seu IMC é: " + imc);


    }
}
