package src.EstruturasDeRepeticao;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero;

            do {
                System.out.print("\nDigite um número (0 para sair): ");
                numero = scanner.nextInt();

                if (numero != 0) {
                    System.out.println("Tabela de multiplicação de " + numero + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " x " + i + " = " + (numero * i));
                    }
                }
            } while (numero != 0);

            System.out.println("Programa encerrado.");
            scanner.close();
        }
    }