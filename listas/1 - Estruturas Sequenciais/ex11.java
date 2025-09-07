import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        double descontoPrevidencia = salarioBruto * 0.10;
        double salarioAposPrevidencia = salarioBruto - descontoPrevidencia;

        double descontoImposto = salarioAposPrevidencia * 0.05;
        double salarioLiquido = salarioAposPrevidencia - descontoImposto;

        // Exibição do resultado
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Desconto Previdência (10%): R$ " + descontoPrevidencia);
        System.out.println("Desconto Imposto (5%): R$ " + descontoImposto);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}