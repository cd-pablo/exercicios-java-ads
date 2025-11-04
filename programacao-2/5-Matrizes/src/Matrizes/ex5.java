package src.Matrizes;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int l = -1;
        int c = -1;

        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();

        // le a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Digite um valor (" + i + ""+ j + "): ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        // procura  o x
        boolean encontrado = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == x) {
                    l = i;
                    c = j;
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) break;  // para tudo
        }

        //exibe
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        if (encontrado) {
            System.out.println("Valor encontrado em (L" + l + "-C" + c + ") - " + x);
        } else {
            System.out.println("não encontrado");
        }

    }
}
