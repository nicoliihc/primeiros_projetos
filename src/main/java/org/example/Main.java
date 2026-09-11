package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o valor da renda mensal do cliente? ");
        double renda = entrada.nextDouble();

        System.out.println("Qual é o valor do score de crédito do cliente? ");
        double score = entrada.nextDouble();

        if (renda >= 8000 && score >= 700){
            System.out.println("O cartão Premium foi aprovado");
        }else if (renda < 8000 && score >= 700){
            System.out.println("O cartão Premium foi negado, valor de renda mensal insuficiente");
        }else if (renda >= 8000 && score < 700) {
            System.out.println("O cartão Premium foi negado, valor de pontos do Score insuficiente");
        }else{
            System.out.println("O cartão Premium foi negado, valores insuficientes");
        }

    }
}
