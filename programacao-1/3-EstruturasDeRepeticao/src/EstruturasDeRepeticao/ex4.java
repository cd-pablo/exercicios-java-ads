package src.EstruturasDeRepeticao;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        double numero;

        System.out.println("Digite números positivos para somar (negativo para parar):");

        while (true) {
            System.out.print("Número: ");
            numero = scanner.nextDouble();

            if (numero < 0) {
                break;
            }

            soma += numero;
        }

        System.out.println("Soma total: " + soma);
        scanner.close();
    }
}