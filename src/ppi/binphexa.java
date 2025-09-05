import java.util.*;

public class binphexa {
    public static void main (String [] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.print("Digite o número em binário: ");
        int numBin = teclado.nextInt();

        //BINARIO PRA DECIMAL
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

        //DECIMAL PRA HEXA
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
