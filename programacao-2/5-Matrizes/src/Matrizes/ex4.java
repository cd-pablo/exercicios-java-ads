package src.Matrizes;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int maior, l = 0, c = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Digite um valor (" + i + j + "):");
                matriz[i][j] = sc.nextInt();
            }
        }

        maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    l = i;
                    c = j;
                }
            }
            System.out.println();
        }

        System.out.println("Maior valor encontrado em (L" + l + "- C" + c + ") - " + maior);
    }
}
