package src.EstruturasDeRepeticao;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("De 1 até " + numero + ":");
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        scanner.close();
    }
}