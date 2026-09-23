package br.com.matheusseba.lista03;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos: ");
        int qtdAlunos = sc.nextInt();

        double somaNotas = 0;
        int qtdMaiorOuIgualSeis = 0;
        int qtdMenorSeis = 0;

        for (int i = 1; i <= qtdAlunos; i++) {
            System.out.println("Digite a nota do aluno " + i + ": ");
            double nota = sc.nextDouble();

            somaNotas += nota;

            if (nota >= 6) {
                qtdMaiorOuIgualSeis++;
            } else {
                qtdMenorSeis++;
            }
        }

        double media = somaNotas / qtdAlunos;

        System.out.printf("Média da turma: %.2f%n", media);
        System.out.println("Alunos com nota >= 6: " + qtdMaiorOuIgualSeis);
        System.out.println("Alunos com nota < 6: " + qtdMenorSeis);

    }
}