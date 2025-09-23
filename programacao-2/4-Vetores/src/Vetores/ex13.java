package src.Vetores;

import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = {3, 12, 18, 27, 35, 42};

        int[] B = new int[10];

        System.out.println("Digite 10 números para a sua aposta:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            B[i] = scanner.nextInt();
        }

        int acertos = 0;
        for (int numB : B) {
            for (int numA : A) {
                if (numB == numA) {
                    acertos++;
                    break;
                }
            }
        }

        System.out.println("\nVocê acertou " + acertos + " números!");
    }
}