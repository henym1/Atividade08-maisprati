package ex07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exercício 07 - Escreva um programa que leia uma frase e conte o número de palavras nela. Considere que as
        // palavras estão separadas por espaços em branco.

        Scanner sc = new Scanner(System.in);

        System.out.println("Contador de palavras: ");
        System.out.print("Escreva a frase a ser contada: ");
        String frase = sc.nextLine();

        String[] palavras = frase.split("\\s+");

        int quantidadePalavras = palavras.length;

        System.out.println("Total de palavras na frase: " + quantidadePalavras);

        sc.close();
    }
}
