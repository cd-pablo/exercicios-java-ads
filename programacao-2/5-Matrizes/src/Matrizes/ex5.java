package src.Matrizes;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // cria 5x5
        int[][] matriz = new int[5][5];
        int l = -1;
        int c = -1;

        // pede para digitar o valor do X
        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();

        // le a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Digite um valor (" + i + ""+ j + "): ");
                matriz[i][j] = sc.nextInt();
            }
        }
        // procura  o x
        boolean encontrado = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == x) {
                    l = i;
                    c = j;
                    encontrado = true;
                    break;  // para quando ve o primeiro
                }
            }
            if (encontrado) break;  // para tudo
        }

        //  o resultado
        if (encontrado) {
            System.out.println("Valor encontrado em (L" + l + "-C" + c + ") - " + x);
        } else {
            System.out.println("não encontrado");
        }

    }
}
