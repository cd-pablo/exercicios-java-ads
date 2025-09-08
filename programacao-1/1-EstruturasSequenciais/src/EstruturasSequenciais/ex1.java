package EstruturasSequenciais;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int antecessor = numero++;
        int sucessor = numero--;

        System.out.println("O antecessor de " + numero + " é " + antecessor + " e o sucessor é " + sucessor);

        scanner.close();
    }
}