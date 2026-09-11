package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a sua nota: ");
        double nota = entrada.nextDouble();

        if (nota >= 7){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
    }
}
