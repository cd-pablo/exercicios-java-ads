package EstruturasSequenciais;

import java.util.Scanner;

public class ex20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da pessoa (em kg): ");
        double peso = scanner.nextDouble();

        double pesoEngordar = peso + (peso * 0.15);

        double pesoEmagrecer = peso - (peso * 0.20);

        System.out.printf("Novo peso se engordar 15%%: %.2f kg%n", pesoEngordar);
        System.out.printf("Novo peso se emagrecer 20%%: %.2f kg%n", pesoEmagrecer);

        scanner.close();
    }
}