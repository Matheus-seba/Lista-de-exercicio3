package br.com.matheusseba.lista03;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Dobro");
            System.out.println("2 - Metade");
            System.out.println("3 - Quadrado");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Digite um número: ");
                    double numero = sc.nextDouble();

                    switch (opcao) {
                        case 1:
                            System.out.printf("Dobro: %.2f%n", numero * 2);
                            break;
                        case 2:
                            System.out.printf("Metade: %.2f%n", numero / 2);
                            break;
                        case 3:
                            System.out.printf("Quadrado: %.2f%n", numero * numero);
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }
}