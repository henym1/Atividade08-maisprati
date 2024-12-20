package ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exercício 03 - Implemente um programa que calcule e exiba os primeiros n números da sequência de Fibonacci.
        // n deve ser fornecido pelo/a usuário/a.

        Scanner sc = new Scanner(System.in);

        System.out.println("Sequencia de Fibonacci");
        System.out.print("Deseja ir ate qual argumento? ");
        int count = sc.nextInt();
        System.out.println();

        int num1 = 0;
        int num2 = 1;
        int soma = num1 + num2;

        System.out.println("Valores:");
        System.out.println(num1);
        System.out.println(num2);

        for (int i = 0; i < count - 2; i++) {
            System.out.println(soma);
            num1 = num2;
            num2 = soma;
            soma = num1 + num2;
        }

        sc.close();
    }
}
