package src.EstruturasDeRepeticao;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int numero;

        System.out.println("Digite números (9999 para parar):");

        while (true) {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero == 9999) {
                break;
            }

            if (numero > maior) {
                maior = numero;
            }
        }

        if (maior != Integer.MIN_VALUE) {
            System.out.println("Maior número: " + maior);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }
        scanner.close();
    }
}