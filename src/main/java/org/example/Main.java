package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        int acima30 = 0;


        double[]temperatura  = new double[10];


        for(int i = 0; i < 10; i++) {
            System.out.println("Registre a temperatura medida hoje " + (i +1) + "/10:");
            temperatura[i] = entrada.nextDouble();
            if (temperatura[i] > 30.0){
                acima30 ++;
            }
        }
        System.out.println("\nDias com temperatura acima de 30°C: " + acima30);

    }
}
