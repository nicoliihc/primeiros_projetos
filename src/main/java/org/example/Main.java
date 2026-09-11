package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua nota (0 a 10): ");
        double nota = entrada.nextDouble();

        if (nota > 10){
            System.out.println("Nota não computada. Digite a nota novamente (0 a 10): ");
        }       if (nota >=9){
            System.out.println("Excelente");
        }else if (nota >= 7){
            System.out.println("Bom");
        } else if (nota >= 5) {
            System.out.println("Regular");
        }else {
            System.out.println("Insuficiente");
        }
    }
}
