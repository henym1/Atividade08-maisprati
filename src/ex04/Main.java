package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exercício 04 - Crie um programa que leia um número inteiro e exiba o número invertido.
        // Exemplo: se o usuário digitar 1234, o programa deve exibir 4321.

        Scanner sc = new Scanner(System.in);

        System.out.println("Inversor de numeros");
        System.out.print("Digite o numero a ser invertido: ");
        String num = sc.next();

        StringBuilder numInvertido = new StringBuilder();
        
        for (int i = num.length() - 1; i >= 0; i--) {
            numInvertido.append(num.charAt(i));
        }

        System.out.println("Numero invertido: " + numInvertido);

        sc.close();
    }
}
