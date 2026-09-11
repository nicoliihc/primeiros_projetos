package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3;


        //Entrada de dados
        System.out.print("Informe a primeira nota: ");
        n1 = entrada.nextInt();
        System.out.print("Informe a segunda nota: ");
        n2 = entrada.nextInt();
        System.out.print("Informe a terceira nota: ");
        n3 = entrada.nextInt();


        // Cálculo
        double media = (double)(n1 + n2 + n3 ) / 3;


        System.out.print("Nota média: " + media);




    }
}
