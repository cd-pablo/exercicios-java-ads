package src.Matrizes;
import java.util.Random;

public class ex10 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(20) + 1; // nextInt(20) gera 0-19, +1 faz 1-20
            }
        }


        // Transformar em matriz triangular inferior (zerar elementos acima da diagonal)
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                matriz[i][j] = 0;
            }
        }


    }
}