package br.com.matheusseba.lista03;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número N de 1 a 9: ");
        int n = sc.nextInt();

        if (n < 1 || n > 9) {
            System.out.println("Entrada inválida.");
        } else {
            for (int tabuada = 1; tabuada <= n; tabuada++) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
                }
                System.out.println();
            }
        }
    }
}