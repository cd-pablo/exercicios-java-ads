package src.EstruturasSequenciais;

import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int PRECO_PEQUENA = 10;
        final int PRECO_MEDIA = 12;
        final int PRECO_GRANDE = 15;

        System.out.print("Digite a quantidade de camisetas pequenas: ");
        int quantidadePequenas = scanner.nextInt();

        System.out.print("Digite a quantidade de camisetas médias: ");
        int quantidadeMedias = scanner.nextInt();

        System.out.print("Digite a quantidade de camisetas grandes: ");
        int quantidadeGrandes = scanner.nextInt();

        int totalPequenas = quantidadePequenas * PRECO_PEQUENA;
        int totalMedias = quantidadeMedias * PRECO_MEDIA;
        int totalGrandes = quantidadeGrandes * PRECO_GRANDE;

        int valorTotal = totalPequenas + totalMedias + totalGrandes;

        System.out.println("Valor total arrecadado: R$ " + valorTotal);

        scanner.close();
    }
}