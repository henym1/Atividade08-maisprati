package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exercício 02 - Crie um programa que leia uma palavra e verifique se ela é um palíndromo
        // (se pode ser lida da mesma forma de trás para frente). Ignore
        // diferenças entre maiúsculas e minúsculas.

        Scanner sc = new Scanner(System.in);

        System.out.println("Verificador de palindromo");
        System.out.print("Digite a palavra a ser verificada: ");
        String isPalindromo = sc.next().toLowerCase();

//        System.out.println(isPalindromo.charAt(isPalindromo.length() - 1));
        int ultimoCaracter = isPalindromo.length() - 1;
        boolean checkPalindromo = true;

        for (int i = 0; i < isPalindromo.length(); i++) {
            if (!(isPalindromo.charAt(i) == isPalindromo.charAt(ultimoCaracter))) {
                checkPalindromo = false;
                break;
            }
            ultimoCaracter--;

        }

        if (checkPalindromo) {
            System.out.println("A palavra " + isPalindromo + " eh palindromo!");
        } else {
            System.out.println("A palavra " + isPalindromo + " nao eh palindromo.");
        }

        sc.close();
    }
}
