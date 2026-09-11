package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o valor investido pelo cliente? ");
        double investimento = entrada.nextDouble();

        if (investimento <= 10000){
            System.out.println("O valor do investimento está na categoria BRONZE");
        }else if (investimento > 10000 && investimento <= 50000){
            System.out.println("O valor do investimento está na categoria PRATA");
        }else if (investimento > 50000 && investimento <= 100000) {
            System.out.println("O valor do investimento está na categoria OURO");
        }else if (investimento > 100000) {
            System.out.println("O valor do investimento está na categoria PLATINUM");
        }else{
            System.out.println("O valor não possui uma determinada categoria");
        }

    }
}
