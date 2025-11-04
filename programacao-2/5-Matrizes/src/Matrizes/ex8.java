package src.Matrizes;
import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite a matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // ( i > j)
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.println("Soma dos elementos abaixo da diagonal principal: " + soma);
        sc.close();
    }
}

