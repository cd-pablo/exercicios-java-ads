package EstruturasSequenciais;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da prestação: ");
        double valor = scanner.nextDouble();
        System.out.print("Digite o valor da taxa de juros: ");
        double taxaJuros = scanner.nextDouble();
        System.out.print("Digite o número de horas: ");
        int horas = scanner.nextInt();

        double prestacao = valor + (valor * (taxaJuros / 100) * horas);

        System.out.println("O valor da prestação é: " + prestacao);

        scanner.close();
    }
}