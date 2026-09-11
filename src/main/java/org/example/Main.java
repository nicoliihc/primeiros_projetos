package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o valor da distância percorrida (em km): ");
        double km = entrada.nextDouble();


        System.out.println("Digite o valor do combústivel gasto (em litros): ");
        double l = entrada.nextDouble();


        double consumomedio = km / l;


        System.out.println("O valor do consumo médio é de: " + consumomedio + "km/l");

    }
}
