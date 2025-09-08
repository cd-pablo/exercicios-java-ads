package src.EstruturasCondicionais;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double precoUnit;

        switch (codigo) {
            case 1001:
                precoUnit = 5.32;
                break;
            case 1324:
                precoUnit = 6.45;
                break;
            case 6548:
                precoUnit = 2.37;
                break;
            case 987:
                precoUnit = 5.32;
                break;
            case 7623:
                precoUnit = 6.45;
                break;
            default:
                System.out.println("Código inválido.");
                scanner.close();
                return; 
        }

        double precoTotal = precoUnit * quantidade;
        System.out.printf("Valor a pagar: R$ %.2f%n", precoTotal);

        scanner.close();
    }
}