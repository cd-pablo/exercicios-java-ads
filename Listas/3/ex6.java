import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicao = 0;
        int[] numeros = new int[10];
        while (posicao <= 9) {
            System.out.println("Digite o numero na posição vetor " + posicao + " :");
            numeros[posicao] = sc.nextInt();
            posicao++;
        }

        posicao = 0;
        while (posicao <= 9) {
            if (posicao % 2 == 0) {
                System.out.println("valor na posição par do vetor: " + numeros[posicao] + " na posição: "+ posicao);
            }
            posicao++;
        }
    }
}
