package src.EstruturasSequenciais;

import java.util.Scanner;

public class ex14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salarioInicial = scanner.nextDouble();

        double aumento = salarioInicial * 0.15;
        double salarioComAumento = salarioInicial + aumento;

        double descontoImposto = salarioComAumento * 0.08;
        double salarioFinal = salarioComAumento - descontoImposto;

        System.out.println("Salário Inicial: R$ " + salarioInicial);
        System.out.println("Salário com Aumento (15%): R$ " + salarioComAumento);
        System.out.println("Salário Final (após 8% de impostos): R$ " + salarioFinal);

        scanner.close();
    }
}