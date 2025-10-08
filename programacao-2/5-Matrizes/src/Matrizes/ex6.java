package src.Matrizes;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // cria 4x4
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];
        int[][] matriz3 = new int[4][4];

        // le matriz 1
        System.out.println("Matriz 1:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("Digite o valor da matriz 1: (" + i + j + "): ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        // le matriz 2
        System.out.println("\nMatriz 2:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print("Digite o valor da matriz 2: (" + i + j + "): ");
                matriz2[i][j] = sc.nextInt();
            }
        }

        // cria matriz 3 com os maior
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3.length; j++) {
                matriz3[i][j] = Math.max(matriz1[i][j], matriz2[i][j]); // esse bagulho do bath max retorna o maior valor entre 2 coisas
            }
        }

        // exibe matriz 1
        System.out.println("\nMatriz 1:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        // exibe matriz 2
        System.out.println("\nMatriz 2:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        // exibe matriz 3
        System.out.println("\nMatriz 3:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

    }
}