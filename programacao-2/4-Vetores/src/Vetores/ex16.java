package src.Vetores;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];
        int[] idades = new int[5];
        String[] times = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Nome do aluno: ");
            nomes[i] = scanner.next();

            System.out.print("Idade do aluno: ");
            idades[i] = scanner.nextInt();

            System.out.print("Time do aluno: ");
            times[i] = scanner.next();

            System.out.println();
        }

        int maisNovo = 0;
        for (int i = 1; i < 5; i++) {
            if (idades[i] < idades[maisNovo]) {
                maisNovo = i;
            }
        }

        int maisVelho = 0;
        for (int i = 1; i < 5; i++) {
            if (idades[i] > idades[maisVelho]) {
                maisVelho = i;
            }
        }

        System.out.println("Aluno mais novo:");
        System.out.println("Nome: " + nomes[maisNovo]);
        System.out.println("Idade: " + idades[maisNovo]);
        System.out.println("Time: " + times[maisNovo]);
        System.out.println();

        System.out.println("Aluno mais velho:");
        System.out.println("Nome: " + nomes[maisVelho]);
        System.out.println("Idade: " + idades[maisVelho]);
        System.out.println("Time: " + times[maisVelho]);

    }
}
