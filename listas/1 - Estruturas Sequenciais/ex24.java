import java.util.Scanner;

public class ex24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PRECO_ANEL_CHIP = 4.00;
        final double PRECO_ANEL_ALIMENTO = 3.50;

        System.out.print("Digite a quantidade de frangos: ");
        int quantidadeFrangos = scanner.nextInt();

        double custoPorFrango = PRECO_ANEL_CHIP + (2 * PRECO_ANEL_ALIMENTO);

        double custoTotal = quantidadeFrangos * custoPorFrango;

        System.out.printf("O gasto total para marcar todos os frangos é: R$ %.2f%n", custoTotal);

        scanner.close();
    }
}