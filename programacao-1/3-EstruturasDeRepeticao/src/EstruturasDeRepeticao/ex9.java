package src.EstruturasDeRepeticao;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalGrenais = 0;
        int vitoriasInter = 0;
        int vitoriasGremio = 0;
        int empates = 0;
        int continuar;

        do {
            totalGrenais++;

            System.out.print("Gols do Inter: ");
            int golsInter = scanner.nextInt();
            System.out.print("Gols do Grêmio: ");
            int golsGremio = scanner.nextInt();

            if (golsInter > golsGremio) {
                vitoriasInter++;
            } else if (golsGremio > golsInter) {
                vitoriasGremio++;
            } else {
                empates++;
            }

            System.out.print("Novo grenal (1-sim 2-nao): ");
            continuar = scanner.nextInt();

        } while (continuar == 1);

        System.out.println("\n=== ESTATÍSTICAS ===");
        System.out.println("Total de GRENAIS: " + totalGrenais);
        System.out.println("Vitórias do Inter: " + vitoriasInter);
        System.out.println("Vitórias do Grêmio: " + vitoriasGremio);
        System.out.println("Empates: " + empates);

        if (vitoriasInter > vitoriasGremio) {
            System.out.println("Inter venceu mais GRENAIS");
        } else if (vitoriasGremio > vitoriasInter) {
            System.out.println("Grêmio venceu mais GRENAIS");
        } else {
            System.out.println("Não houve vencedor");
        }

        scanner.close();
    }
}
