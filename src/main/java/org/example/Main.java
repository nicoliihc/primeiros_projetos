package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo múmero: ");
        int num2 = entrada.nextInt();

        if(num1 > num2){
            System.out.println("O " + num1 + " é maior que " + num2);
        }
        if(num1 < num2){
            System.out.println("O " + num2 + " é maior que " +num1);
        }else{
            System.out.println("Os números são iguais");
        }
    }
}
