package br.com.matheusseba.lista03;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro não negativo: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Entrada inválida.");
        } else {
            long fatorial = 1;

            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }

            System.out.println("Fatorial de " + n + " = " + fatorial);
        }
    }
}