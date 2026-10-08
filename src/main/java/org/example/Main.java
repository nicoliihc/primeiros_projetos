package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        int[] talhao = new int[5];
        int soma = 0;

        for (int i = 0; i < talhao.length; i++) {
            System.out.println("Registre a produção de hortaliças do talhão " + (i + 1) + ":");
            talhao[i] = entrada.nextInt();
            soma += talhao[i];
        }

        System.out.println("\nProdução Individual de cada Talhão: ");
        for (int c = 0; c < talhao.length; c++) {
            System.out.println("Talhão " + (c + 1) + ": " + talhao[c]);
        }

        System.out.println("\nProdução total: " + soma);

    }
}
