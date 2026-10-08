package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        int inf40 = 0;

        double[]sensor  = new double[8];

        for(int i = 0; i < sensor.length; i++) {
            System.out.println("Registre a umidade do solo da Área " + (i +1) + ":");
            sensor[i] = entrada.nextDouble();
            if (sensor[i] < 40.0){
                inf40++;
            }
        }
        System.out.println("\n" + (inf40) + " área(s) possuem umidade inferior a 40%");
    }
}
