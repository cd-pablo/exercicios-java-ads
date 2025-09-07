import java.util.Scanner;

public class ex23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double precoProduto = scanner.nextDouble();

        double desconto = precoProduto * 0.10;
        double novoPreco = precoProduto - desconto;

        System.out.printf("O novo preço com desconto de 10%% é: R$ %.2f%n", novoPreco);

        scanner.close();
    }
}