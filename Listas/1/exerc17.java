import java.util.Scanner;

public class exerc17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PRECO_PAO = 0.12;
        final double PRECO_BROA = 1.50;

        System.out.print("Digite a quantidade de pães vendidos: ");
        int quantidadePaes = scanner.nextInt();

        System.out.print("Digite a quantidade de broas vendidas: ");
        int quantidadeBroas = scanner.nextInt();

        double totalPaes = quantidadePaes * PRECO_PAO;
        double totalBroas = quantidadeBroas * PRECO_BROA;
        double totalArrecadado = totalPaes + totalBroas;

        double valorPoupanca = totalArrecadado * 0.10;

        System.out.println("Total arrecadado: R$ " + totalArrecadado);
        System.out.println("Valor a ser guardado na poupança (10%): R$ " + valorPoupanca);

        scanner.close();
    }
}