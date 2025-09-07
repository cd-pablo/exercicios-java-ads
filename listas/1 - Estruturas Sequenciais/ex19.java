import java.util.Scanner;

public class ex19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário fixo do funcionário: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor total das vendas do funcionário: ");
        double valorVendas = scanner.nextDouble();

        double comissao = valorVendas * 0.04;

        double salarioFinal = salarioFixo + comissao;

        System.out.printf("Comissão: R$ %.2f%n", comissao);
        System.out.printf("Salário Final: R$ %.2f%n", salarioFinal);

        scanner.close();
    }
}