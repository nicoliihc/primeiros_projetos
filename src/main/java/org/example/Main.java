package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite o nome do Produto recebido (" + i + "/15): ");
            String produto = entrada.nextLine();

            System.out.println("Produto conferido: " + produto);
        }

        System.out.println("Conferência de 15 produtos recebidos!");
    }
}
