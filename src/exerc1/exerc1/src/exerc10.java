import java.util.Scanner;

public class exerc10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do tempo: ");
        double tempo = scanner.nextDouble();
        System.out.print("Digite o valor da velocidade: ");
        double velocidade = scanner.nextDouble();

        double distancia = velocidade * tempo;
        double litros = distancia / 12;

        System.out.println("A distância percorrida é: " + distancia + " km");
        System.out.println("O valor de litros gastos é: " + litros + " L");
        System.out.println("O valor de tempo é: " + tempo + " h");
        scanner.close();

    }
}
