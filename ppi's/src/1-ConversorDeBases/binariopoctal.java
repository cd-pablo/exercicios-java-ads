import java.util.*;

public class binariopoctal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número em binário: ");
        int numBin = teclado.nextInt();

        // BINARIO PRA DECIMAL
        int decimal = 0;
        int posicao = 0;

        while (numBin > 0) {
            int resto = numBin % 10;
            if (resto < 0 || resto > 1) {
                System.out.println("Número binário inválido! Use apenas dígitos entre 0 e 1.");
                return;
            }
            decimal += resto * Math.pow(2, posicao);
            numBin = numBin / 10;
            posicao++;
        }

        // DECIMAL PRA OCTAL
        int octal = 0;
        int mult = 1;
        
        while (decimal > 0) {
            octal += (decimal % 8) * mult;
            decimal = decimal / 8;
            mult *= 10;
        }

        System.out.println("O valor binário convertido para octal é: " + octal);

    }
}
