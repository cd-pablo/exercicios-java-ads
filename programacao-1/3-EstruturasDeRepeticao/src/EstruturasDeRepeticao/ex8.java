package src.EstruturasDeRepeticao;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int contador = 0;
        int idade;

        System.out.println("Digite as idades (negativo para parar):");

        while (true) {
            System.out.print("Idade: ");
            idade = scanner.nextInt();

            if (idade < 0) {
                break;
            }

            soma += idade;
            contador++;
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.printf("Média de idade: %.2f anos\n", media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }
        scanner.close();
    }
}