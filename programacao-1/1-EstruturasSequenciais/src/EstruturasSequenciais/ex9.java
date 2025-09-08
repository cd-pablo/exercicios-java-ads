package EstruturasSequenciais;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do cheque: ");
        double valorCheque = scanner.nextDouble();

        double cliente = 500 - valorCheque;

        System.out.println("o saldo do cleinte era 500R$ \n" + "O valor do cheque é: " + valorCheque + "\n o valor do cliente agora é: " + cliente);
        scanner.close();

    }
}
