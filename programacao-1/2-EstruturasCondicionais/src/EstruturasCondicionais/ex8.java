package src.EstruturasCondicionais;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu sexo: ");
        String sexo = scanner.next();

        if (sexo.equals("homem")) {
            double pesoIdeal = 72.7 * altura - 58;
            System.out.println("Seu peso ideal é: " + pesoIdeal);
        } else {
            System.err.println("Sexo inválido");
        }

        if (sexo.equals("mulher")) {
            double pesoIdeal = 62.1 * altura - 44.7;
            System.out.println("Seu peso ideal é: " + pesoIdeal);
        } else {
            System.err.println("Sexo inválido");

        }
        scanner.close();
    }
}
