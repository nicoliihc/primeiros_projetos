package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o valor da hora trabalhada: ");
        double valor = entrada.nextDouble();


        System.out.println("Digite o número de horas trabalhadas no mês: ");
        int horas = entrada.nextInt();


        double salario = valor * horas;


        System.out.println("O salário bruto é de: " + salario + " reais");

    }
}
