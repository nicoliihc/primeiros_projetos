package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        int vendas = 0;
        double total = 0;

        System.out.println("""
            \nEscolha uma opção: 
            1 - Registrar venda
            2 - Encerrar sistema """);
        int opcao = entrada.nextInt();

        while (opcao == 1) {
            System.out.println("Digite o valor da venda: ");
            double venda = entrada.nextDouble();

            total += venda;
            vendas++;

            System.out.println("""
            Deseja continuar?
            1 - Sim
            2 - Não""");
            opcao = entrada.nextInt();
        }

        System.out.println("Total de vendas: " + vendas);
        System.out.println("Faturamento total: R$ " + total);
    }
}
