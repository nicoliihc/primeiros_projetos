package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int producao = 0;
        double media = 0.0;
        int maior_producao = 0;

        int[]milho  = new int[7];

        for(int i = 0; i < 7; i++) {
            System.out.println("Registre a quantidade de milho produzido esta semana (toneladas): " + (i+1) + "/7" );
            milho[i] = entrada.nextInt();
            producao += milho[i];
        }

        media = producao/7;

        maior_producao = milho[0] ;
        for (int i = 1; i < 7; i++){
            if (milho[i] > maior_producao){
                maior_producao = milho[i];
            }
        }

        System.out.println("\nA quantidade de milhos produzidos ao total é: " + producao);
        System.out.println("\nA média de produção é: " + media);
        System.out.println("\nMaior produçao registrada: " + maior_producao);


    }
}
