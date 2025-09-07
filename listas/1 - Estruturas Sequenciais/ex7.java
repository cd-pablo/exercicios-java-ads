import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Fórmula de conversão: Celsius = (Fahrenheit - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("A temperatura em graus Celsius é: " + celsius);

        scanner.close();
    }
}