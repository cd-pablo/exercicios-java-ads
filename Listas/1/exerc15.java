import java.util.Scanner;

public class exerc15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de cavalos comprados: ");
        int quantidadeCavalos = scanner.nextInt();

        int quantidadeFerraduras = quantidadeCavalos * 4;

        System.out.println("Quantidade de ferraduras necessárias: " + quantidadeFerraduras);

        scanner.close();
    }
}