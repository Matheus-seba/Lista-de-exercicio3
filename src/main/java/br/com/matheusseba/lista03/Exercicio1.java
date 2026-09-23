package br.com.matheusseba.lista03;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Não há valores a exibir.");
        } else {
            int i = 1;
            while (i <= n) {
                System.out.println(i);
                i++;
            }
        }
    }
}