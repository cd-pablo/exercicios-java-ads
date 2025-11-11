package src.Matrizes;
import java.util.Random;

public class ex11 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(0) + 99;
            }
        }

        System.out.println("\nMatriz base");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        }
    }
