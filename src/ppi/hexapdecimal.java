import java.util.*;

public class hexapdecimal {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.print("Digite o número em hexadecimal: ");
        String numHex = numero.nextLine().toUpperCase(); // Lê o hexadecimal como string e converte para maiúsculo

        int decimal = 0; 
        int posicao = 0; 

        // Percorre o número hexadecimal da direita para a esquerda
        for (int i = numHex.length() - 1; i >= 0; i--) {
            char chaar = numHex.charAt(i); // Pega o caractere atual
            int valor;
            if (chaar >= '0' && chaar <= '9') {
                valor = chaar - '0'; // Converte '0'-'9' para 0-9
            } else if (chaar >= 'A' && chaar <= 'F') {
                valor = 10 + (chaar - 'A'); // Converte 'A'-'F' para 10-15
            } else {
                System.out.println("Número hexadecimal inválido! Use apenas dígitos entre 0-9 e A-F.");
                return;
            }
            // Soma o valor multiplicado pelo peso da posição (16^posicao)
            decimal += valor * Math.pow(16, posicao);
            posicao++; // Vai para a próxima posição (peso maior)
        }
        // Exibe o resultado final
        System.out.println("O valor hexadecimal convertido para decimal é: " + decimal);
    }
}