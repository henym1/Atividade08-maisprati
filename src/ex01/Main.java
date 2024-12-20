package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exercício 01 - Escreva um programa que peça dois números e um operador (+, -, *, /).
        // Realize a operação indicada e exiba o resultado.

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de operações simples");
        System.out.print("Insira o primeiro valor: ");
        double valor1 = sc.nextDouble();
        System.out.print("Insira o segundo valor: ");
        double valor2 = sc.nextDouble();

        System.out.println();

        System.out.print("Informe a operação desejada: (+, -, *, /) ");
        char operador = sc.next().charAt(0);

        switch(operador) {
            case '+':
                System.out.println("Resultado da soma: " + (valor1 + valor2));
                break;
            case '-':
                System.out.println("Resultado da subtração: " + (valor1 - valor2));
                break;
            case '*':
                System.out.println("Resultado da multiplicação: " + (valor1 * valor2));
                break;
            case '/':
                System.out.println("Resultado da divisão: " + (valor1 / valor2));
                break;
            default:
                System.out.println("Operador inválido!");
        }

        sc.close();
    }
}
