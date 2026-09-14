package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        for (int contador = 1; contador <= 10; contador++){
            System.out.println("Registre o seu nome: ");
            String nome = entrada.nextLine();
            System.out.println(nome + " está registrado como participante " + contador);
        }

    }
}
