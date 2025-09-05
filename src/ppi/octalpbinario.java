import java.util.*;

public class octalpbinario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número em octal: ");
        int numOctal = teclado.nextInt();

        // OCTAL PARA DECIMAL
        int decimal = 0;
        int posicao = 0;

        while (numOctal > 0) {
            int resto = numOctal % 10;
            if (resto < 0 || resto > 7) {
                System.out.println("Número octal inválido! Use apenas dígitos entre 0 e 7.");
                return;
            }
            decimal += resto * Math.pow(8, posicao);
            numOctal = numOctal / 10;
            posicao++;
        }

        // DECIMAL PARA BINÁRIO
        int binario = 0;
        int mult = 1;
        while (decimal > 0) {
            binario += (decimal % 2) * mult;
            decimal = decimal / 2;
            mult *= 10;
        }
        System.out.println("O valor octal convertido para binário é: " + binario);

    }
}
