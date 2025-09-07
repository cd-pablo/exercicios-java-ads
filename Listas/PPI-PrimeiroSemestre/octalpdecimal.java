import java.util.*;

public class octalpdecimal {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.print("Digite o número octal: ");
        int numOctal = numero.nextInt();

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
        System.out.println("O valor octal convertido para decimal é: " + decimal);
    }
}