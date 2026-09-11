package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o cargo do funcionário? ");
        String cargo = entrada.nextLine();

        if (cargo.equalsIgnoreCase("administrativo")) {
            System.out.println("O funcionário pode participar do programa de idiomas");
        } else if (cargo.equalsIgnoreCase("liderança")  ||
                cargo.equalsIgnoreCase("lideranca")){
            System.out.println("O funcionário pode participar do programa de idiomas");
        }else {
            System.out.println("Ele não pode participar do programa");
        }
    }
}
