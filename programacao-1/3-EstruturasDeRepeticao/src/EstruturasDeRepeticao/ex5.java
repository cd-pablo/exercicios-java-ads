package src.EstruturasDeRepeticao;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int numero;

        System.out.println("Digite números (0 para parar):");

        while (true) {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero >= 100 && numero <= 200) {
                contador++;
            }
        }

        System.out.println("Quantidade de números entre 100 e 200: " + contador);
        scanner.close();
    }
}
