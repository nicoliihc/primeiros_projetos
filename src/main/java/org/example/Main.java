package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite o total de segundos: ");
        int totalSeg = entrada.nextInt();


        int hrs = totalSeg / 3600;
        int resto = totalSeg % 3600;
        int min = resto / 60;
        int seg = resto % 60;


        System.out.println(hrs + " horas, " + min + " minutos e " + seg + " segundos");


    }
}
