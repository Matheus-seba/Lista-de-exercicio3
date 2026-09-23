package br.com.matheusseba.lista03;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade = 0;
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite um valor (0 para encerrar): ");
        int valor = sc.nextInt();

        while (valor != 0) {
            quantidade++;
            soma += valor;

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }

            System.out.println("Digite um valor (0 para encerrar): ");
            valor = sc.nextInt();
        }

        if (quantidade == 0) {
            System.out.println("Nenhum valor foi lido.");
        } else {
            System.out.println("Quantidade de valores lidos: " + quantidade);
            System.out.println("Soma: " + soma);
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        }
    }
}