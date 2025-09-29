package src.Vetores;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                String[] nomes = new String[3];
                int[] votos = new int[3];

                for (int i = 0; i < 3; i++) {
                    System.out.print("Digite o nome do candidato " + (i + 1) + ": ");
                    nomes[i] = scanner.nextLine();

                    System.out.print("Digite a quantidade de votos de " + nomes[i] + ": ");
                    votos[i] = scanner.nextInt();
                    scanner.nextLine();
                }


                int indiceVencedor = 0;
                for (int i = 1; i < 3; i++) {
                    if (votos[i] > votos[indiceVencedor]) {
                        indiceVencedor = i;
                    }
                }

                System.out.println("O candidato vencedor é: " + nomes[indiceVencedor]);

                scanner.close();
            }
        }