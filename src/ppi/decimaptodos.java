import java.util.*;

public class decimaptodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número a ser convertido: ");
        int num = scanner.nextInt();
        System.out.print("Digite a base: ");
        int base = scanner.nextInt();

        if (num == 0) {

            System.out.println("0");
        } 
        else {

            String resultado = "";
            int numero = num;

            while (numero > 0) {
                int resto = numero % base;
                resultado = resto + resultado;
                numero = numero / base;
            }
            System.out.println("Resultado: " + resultado);
        }
        scanner.close();
    }
}
