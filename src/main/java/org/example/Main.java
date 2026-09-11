package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        int a, b;
        a = 10;
        b = 5;

        boolean maior = a > b;

        System.out.println("'a' maior que 'b'? R:  " + maior);
        System.out.println("'a' menor que 'b'? R:  " + (a < b));
        System.out.println("'a' maior ou igual que 'b'? R:  " + (a >= b));
        System.out.println("'a' menor ou igual que 'b'? R:  " + (a <= b));
        System.out.println("'a' igual que 'b'? R:  " + (a == b));
        System.out.println("'a' diferente que 'b'? R:  " + (a != b));


    }
}
