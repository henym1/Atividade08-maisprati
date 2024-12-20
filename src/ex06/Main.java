package ex06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exercício 06 - Crie um jogo em que o programa escolhe um número entre 1 e 50, e o/a usuário/a
        // deve adivinhar. O programa informa apenas se o palpite está certo ou errado.
        // O jogo termina quando o número é adivinhado.

        Scanner sc = new Scanner(System.in);

        System.out.println("Jogo de adivinhar número!");
        int numeroSorteado = (int) (Math.random() * 50) + 1;

//        System.out.println(numeroSorteado);

        int numeroPalpite = 0;

        while (numeroPalpite != numeroSorteado) {
            System.out.print("Faca uma nova tentativa: ");
            numeroPalpite = sc.nextInt();

            if (numeroPalpite == numeroSorteado) {
                System.out.println("ACERTOU!!!");
                break;
            }
        }

        sc.close();
    }
}
