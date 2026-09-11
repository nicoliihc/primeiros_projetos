package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("O funcionário utiliza veículo próprio para trabalhar? ");
        String resp = entrada.nextLine();

        if (resp.equalsIgnoreCase("s")) {
            System.out.println("Ele PODE solicitar o auxílio combustível");
        } else {
            System.out.println("Ele NÃO pode solicitar o auxílio combustível");
        }

    }
}
