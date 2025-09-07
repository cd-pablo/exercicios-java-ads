import java.util.Scanner;

public class exerc21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double resultado = numero1 * numero2 * numero3;

        System.out.printf("A multiplicação dos três números é: %.2f%n", resultado);

        scanner.close();
    }
}