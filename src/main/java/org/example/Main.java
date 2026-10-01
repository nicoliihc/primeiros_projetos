package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        double total = 0.0;
        double valor = 0.0;

        System.out.println("\n--- Registro de Vendas ---");
        System.out.println("Registre o valor do produto: ");
        valor = entrada.nextDouble();
        total+=valor;

        System.out.println("""
                        \nSelecione uma opção: 
                        1 - Continuar
                        2 - Encerrar""");
        int opcao = entrada.nextInt();

        while (opcao == 1 ) {
            System.out.println("\nRegistre o valor do produto: ");
            valor = entrada.nextDouble();
            total += valor;

            System.out.println("""
                        \nSelecione uma opção: 
                        1 - Continuar
                        2 - Encerrar""");
            opcao = entrada.nextInt();
        }

        System.out.println("""
                        \nOperação encerrada!
                        Total: """ + total + "reais");

    }
}
