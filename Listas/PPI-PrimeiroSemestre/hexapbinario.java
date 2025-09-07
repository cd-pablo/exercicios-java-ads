import java.util.*;

public class hexapbinario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número em binário: ");
        int numBin = teclado.nextInt();

        //BINARIO P DECIMAL
        int decimal = 0;
        int posicao = 0;
        int tempBin = numBin; // Para não perder o valor original
        while (tempBin > 0) {
            int resto = tempBin % 10;
            if (resto < 0 || resto > 1) {
                System.out.println("Número binário inválido! Use apenas dígitos 0 ou 1.");
                return;
            }
            decimal += resto * Math.pow(2, posicao);
            tempBin = tempBin / 10;
            posicao++;
        }

        //DECIMAL P BINARIO
        if (decimal == 0) {
            System.out.println("Hexadecimal: 0");
        } else {
            String hex = "";
            int temp = decimal;
            while (temp > 0) {
                int resto = temp % 16;
                char digito;
                if (resto < 10) {
                    digito = (char) ('0' + resto);
                } else {
                    digito = (char) ('a' + (resto - 10));
                }
                hex = digito + hex;
                temp = temp / 16;
            }
            System.out.println("O valor binário convertido para hexadecimal é: " + hex);
        }
    }
}
