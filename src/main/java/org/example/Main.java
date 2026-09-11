package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do seu Salário: ");
        int salario = entrada.nextInt();

        if (salario <= 4000){
            System.out.println("Você POSSUI direito ao Vale Refeição");
        }else{
            System.out.println("Você NÃO possui direito ao Vale Refeição");
        }
    }
}
