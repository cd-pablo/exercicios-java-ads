package src.EstruturasDeRepeticao;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de medidas: ");
        int n = scanner.nextInt();

        int[] medidas = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Medida " + (i + 1) + ": ");
            medidas[i] = scanner.nextInt();
        }

        int primeiraQueda = 0;

        for (int i = 1; i < n; i++) {
            if (medidas[i] < medidas[i - 1]) {
                primeiraQueda = i + 1; // +1 porque as posições começam em 1
                break;
            }
        }

        System.out.println("Resultado: " + primeiraQueda);
        scanner.close();
    }
}