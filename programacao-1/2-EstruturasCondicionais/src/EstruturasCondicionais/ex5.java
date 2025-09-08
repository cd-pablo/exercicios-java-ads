package src.EstruturasCondicionais;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite o número de aulas ministradas: ");
        int aulasDadas = scanner.nextInt();

        System.out.print("Digite o número de aulas assistidas: ");
        int aulasAssistidas = scanner.nextInt();

        double media = (nota1 + nota2) / 2;

        double frequencia = (double) aulasAssistidas / aulasDadas * 100;

        if (media >= 6.0 && frequencia >= 75.0) {
            System.out.println("Média final: " + media);
            System.out.println("Frequência: " + frequencia + "%");
            System.out.println("Resultado: Aprovado");
        } else {
            System.out.println("Média final: " + media);
            System.out.println("Frequência: " + frequencia + "%");
            System.out.println("Resultado: Reprovado");
        }

        scanner.close();
    }
}