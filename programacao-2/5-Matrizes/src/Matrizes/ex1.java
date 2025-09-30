package src.Matrizes;

import java.util.Random;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                int[][] matriz = new int[4][4];
                int contador = 0;

                System.out.println("Digite os valores da matriz 4x4:");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print("Elemento [" + i + "][" + j + "]: ");
                        matriz[i][j] = scanner.nextInt();

                        if (matriz[i][j] > 10) {
                            contador++;
                        }
                    }
                }

                System.out.println("A matriz possui " + contador + " valores maiores que 10.");

                scanner.close();
            }
        }
