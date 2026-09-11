package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número (dividendo): ");
        int a = entrada.nextInt();


        System.out.print("Digite o segundo número (divisor): ");
        int b = entrada.nextInt();


        int quociente = a / b;
        int resto = a % b;


        System.out.println("Quociente da divisão inteira: " + quociente);
        System.out.println("Resto da divisão: " + resto);

    }
}
