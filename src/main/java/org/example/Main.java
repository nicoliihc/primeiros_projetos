package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o preço do produto: ");
        double preco = entrada.nextDouble();


        double desconto = preco * 0.15;
        double valorf = preco - desconto;


        System.out.println("O valor final do produto com o desconto é de: " + valorf + " reais");

    }
}
