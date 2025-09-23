package src.Vetores;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] vetor = new int[5];

            for (int i = 0; i < 5; i++) {

                int num;

                do {
                    System.out.print("Digite 5 números pares: ");
                    num = scanner.nextInt();
                    if (num % 2 != 0) {
                        System.out.println("Número ímpar! Digite novamente.");
                    }
                }

                while (num % 2 != 0);
                vetor[i] = num;
            }

            System.out.println("\nVetor resultante:");

            for (int num : vetor) {
                System.out.print(num + " ");
            }

            scanner.close();
        }
    }