package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o tempo de contratação, em meses, de seu funcionário: ");
        int meses = entrada.nextInt();

        if (meses >= 3){
            System.out.println("O plano de saúde está DISPONÍVEL");
        }else{
            System.out.println("O plano de saúde NÂO está disponível");
        }

    }
}
