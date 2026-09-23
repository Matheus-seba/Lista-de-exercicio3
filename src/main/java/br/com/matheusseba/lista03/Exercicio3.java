package br.com.matheusseba.lista03;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;

        do {
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        } while (nota < 0 || nota > 10);

        System.out.printf("Nota aceita: %.2f%n", nota);

    }
}