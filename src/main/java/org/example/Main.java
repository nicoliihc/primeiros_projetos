package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        int[]setores  = new int[12];
        double num = 0.0;
        int setor = 0;

        for(int i = 0; i < setores.length; i++) {
            System.out.println("Registre o valor do consumo de água do setor " + (i + 1) + ":");
            setores[i] = entrada.nextInt();
            if (setores[i] > num){
                num = setores[i];
                setor = (i + 1);
            }
        }

        System.out.println("\nO setor que mais consumiu água foi: " + setor);
    }
}
