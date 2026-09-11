package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é o valor do saldo médio mensal do cliente? ");
        double saldo = entrada.nextDouble();

        if (saldo >= 5000){
            System.out.println("O Cliente possui direito à isenção de tarifa bancária");
        }else{
            System.out.println("O Cliente NÃO possui direito à isenção de tarifa bancária. A tarifa será mantida");
        }



    }
}
