package src.EstruturasCondicionais;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        String resultado;

        if (num1 == num2) {
            resultado = "Números iguais";
        } else if (num1 > num2) {
            resultado = num1 + " é maior número";
        } else {
            resultado = num2 + " é maior número";
        }

        System.out.println(resultado);

        scanner.close();
    }
}
