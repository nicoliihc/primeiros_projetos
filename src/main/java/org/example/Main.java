package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("""
                1 - Domingo
                2 - Segunda
                3 - Terça
                4 - Quarta
                5 - Quinta
                6 - Sexta
                7 - Sábado""");

        System.out.println("Digite o número escolhido: ");
        int num = entrada.nextInt();

        switch (num){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            case 8:
                System.out.println("Opção inválida");
                break;
        }
    }
}
