package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        double venda, soma = 0;

        for (int contador = 1; contador <= 5; contador++){
            System.out.println("Informe o valor da venda: ");
            venda = entrada.nextDouble();
            soma += venda;
        }
        System.out.println("O total é de R$ " + soma);

    }
}
