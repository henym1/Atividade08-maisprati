package ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercício 05 - Escreva um programa
        // que receba duas palavras e determine se elas são anagramas (se possuem
        // as mesmas letras, mas em ordem diferente). Exemplo: "amor" e "roma"

        Scanner sc = new Scanner(System.in);

        System.out.println("Verificador de anagramas");
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = sc.next();

        System.out.println();
        System.out.print("Digite a segunda palavra: ");
        String palavra2 = sc.next();

        StringBuilder verificaAnagrama = new StringBuilder();

        for (int i = palavra1.length() - 1; i >= 0; i--) {
            verificaAnagrama.append(palavra1.charAt(i));
        }

        if (verificaAnagrama.toString().equals(palavra2)) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        sc.close();
    }
}
