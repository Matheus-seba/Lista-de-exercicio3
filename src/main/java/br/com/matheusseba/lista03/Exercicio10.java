package br.com.matheusseba.lista03;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        int quantidadeItens = 0;

        System.out.print("Digite o código do produto (0 para encerrar): ");
        int codigo = sc.nextInt();

        while (codigo != 0) {
            System.out.print("Digite o preço unitário: ");
            double preco = sc.nextDouble();

            System.out.print("Digite a quantidade: ");
            int quantidade = sc.nextInt();

            total += preco * quantidade;
            quantidadeItens += quantidade;

            System.out.print("Digite o código do produto (0 para encerrar): ");
            codigo = sc.nextInt();
        }

        System.out.print("Digite a forma de pagamento (1-Dinheiro, 2-Débito, 3-Crédito): ");
        int formaPagamento = sc.nextInt();

        switch (formaPagamento) {
            case 1:
                total = total - (total * 0.05);
                System.out.println("Pagamento em dinheiro: 5% de desconto aplicado.");
                break;
            case 2:
                System.out.println("Pagamento em débito: sem alteração no valor.");
                break;
            case 3:
                total = total + (total * 0.03);
                System.out.println("Pagamento em crédito: 3% de acréscimo aplicado.");
                break;
            default:
                System.out.println("Forma de pagamento inválida. Total sem alteração.");
                break;
        }

        if (total > 300.00) {
            System.out.println("Aviso: compra grande (total acima de R$ 300,00).");
        }

        if (quantidadeItens > 20) {
            System.out.println("Aviso: muitos itens (mais de 20 unidades).");
        }

        System.out.printf("Total final: R$ %.2f%n", total);
    }
}