import java.util.*;

public class binariopdecimal {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.print("Digite o número em binário: ");
        int numBin = numero.nextInt();

        int decimal = 0; 
        int posicao = 0; 

        while (numBin > 0) {
            int resto = numBin % 10;
            if (resto < 0 || resto > 1) {
                System.out.println("Número octal inválido! Use apenas dígitos entre 0 e 7.");
                return;
            }
            decimal += resto * Math.pow(2, posicao);
            numBin = numBin / 10;
            posicao++;
        }
        System.out.println("O valor binário convertido para decimal é: " + decimal);
    }
}