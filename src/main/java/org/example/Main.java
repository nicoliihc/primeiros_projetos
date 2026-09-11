package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o valor da transação? ");
        double transacao = entrada.nextDouble();

        if (transacao > 10000){
            System.out.println("Detecção de Transação Suspeita! A transação deve ser analisada");
        }else {
            System.out.println("Transação OK");
        }

    }
}
