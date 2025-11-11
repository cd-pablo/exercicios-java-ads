package src.Modularizacao;
import java.util.Scanner;

public class ex5 {

    public static double CpraF(double celsius) {
        return (9.0 * celsius / 5.0) + 32;
    }

    public static double FpraC(double fahrenheit) {
        return 5.0 * (fahrenheit - 32) / 9.0;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a entrada:");
        System.out.println("1 - Temperatura em Celsius");
        System.out.println("2 - Temperatura em Fahrenheit");
        int escolha = scanner.nextInt();

        double tempConvert;

        switch (escolha) {
            case 1:
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();
                tempConvert = CpraF(celsius);
                System.out.println(celsius + "°C é igual a " + tempConvert + "°F");
                break;

            case 2:
                System.out.print("Digite a temperatura em Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                tempConvert = FpraC(fahrenheit);
                System.out.println(fahrenheit + "°F é igual a " + tempConvert + "°C");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

    }

}