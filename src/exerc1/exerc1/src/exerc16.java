import java.util.Scanner;

public class exerc16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do litro da gasolina: ");
        double precoLitro = scanner.nextDouble();

        System.out.print("Digite o valor do pagamento: ");
        double valorPagamento = scanner.nextDouble();

        double litros = valorPagamento / precoLitro;

        System.out.println("Você conseguiu colocar " + litros + " litros de gasolina no tanque.");

        scanner.close();
    }
}