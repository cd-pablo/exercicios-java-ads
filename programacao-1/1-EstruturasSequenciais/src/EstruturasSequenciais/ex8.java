package src.EstruturasSequenciais;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do comprimento: ");
        double comprimento = scanner.nextDouble();
        System.out.print("Digite o valor da largura: ");
        double largura = scanner.nextDouble();
        System.out.print("Digite o número da altura: ");
        int altura = scanner.nextInt();

        double volume = comprimento * largura * altura;

        System.out.println("O valor do volume é: " + volume+ " o valor do comprimento é:\n" + comprimento + " o valor da largura é:\n" + largura + " e o número da altura é:\n" + altura);
        scanner.close();
    }
}
