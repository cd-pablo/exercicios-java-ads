package src.Vetores;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[10];

        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número 10 números: ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }
        System.out.println("total: "+soma);
        sc.close();
















    }
}

