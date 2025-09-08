package src.EstruturasCondicionais;
import java.util.*;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de Y: ");
        int y = scanner.nextInt();

        System.out.print("Digite o valor de Z: ");
        int z = scanner.nextInt();

        int menor = Math.min(x, Math.min(y, z));

        System.out.println("O menor valor é: " + menor);

        scanner.close();
    }
}