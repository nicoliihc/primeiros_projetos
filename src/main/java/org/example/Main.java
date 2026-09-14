package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        int nota, contador = 0;

        while (contador < 10){
            contador++;
            System.out.println("Cliente n." + contador + ", avalie a nossa loja");
            nota = entrada.nextInt();
        }
        System.out.println(contador + " clientes avaliaram a nossa loja ");

    }
}
