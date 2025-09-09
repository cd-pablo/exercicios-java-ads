package src.Vetores;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("\nInforme o número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

        }
        int porcentualPar = 0;
        porcentualPar = 100 * pares / 10;

        int porcentualImpares = 0;
        porcentualImpares = (100 * impares) / 10;

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("P%: " + porcentualPar);
        System.out.println("I%: " + porcentualImpares);
    }
}