package EstruturasSequenciais;

import java.util.Scanner;
public class ex22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = numero1 / numero2;

        System.out.printf("A divisão do primeiro número pelo segundo é: %.2f%n", resultado);

        scanner.close();
    }
}