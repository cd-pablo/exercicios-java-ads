import java.util.Scanner;

public class exerc18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PRECO_POR_QUILO = 12.00;

        System.out.print("Digite o peso do prato (em quilos): ");
        double pesoPrato = scanner.nextDouble();


        double valorAPagar = pesoPrato * PRECO_POR_QUILO;


        System.out.printf("Valor a pagar: R$ %.2f%n", valorAPagar);

        scanner.close();
    }
}