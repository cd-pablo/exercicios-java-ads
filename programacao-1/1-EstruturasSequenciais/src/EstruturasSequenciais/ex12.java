package src.EstruturasSequenciais;

import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        int ano = idade * 365;

        System.err.println(" Sua idade em dias é: " + ano + " dias.");
        scanner.close();

    }
}
