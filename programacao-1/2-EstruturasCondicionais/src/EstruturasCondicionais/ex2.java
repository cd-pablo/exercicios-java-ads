package src.EstruturasCondicionais;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        String categoria;

        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B";
        } else if (idade >= 18) {
            categoria = "Sênior";
        } else {
            categoria = "Idade fora das categorias disponíveis.";
        }

        System.out.println("Categoria: " + categoria);
        scanner.close();
    }
}