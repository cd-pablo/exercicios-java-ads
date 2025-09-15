package src.EstruturasDeRepeticao;

import java.util.Random;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int arvoreMarciano = random.nextInt(100) + 1;
        int balas = 5;
        boolean acertou = false;

        System.out.println("O marciano se escondeu atrás de uma das 100 árvores!");
        System.out.println("Você tem " + balas + " balas. Boa sorte!");

        while (balas > 0 && !acertou) {
            System.out.print("\nEm qual árvore você atira? (1-100): ");
            int tiro = scanner.nextInt();

            if (tiro == arvoreMarciano) {
                acertou = true;
                System.out.println("ACERTOU! Você derrotou o marciano!");
            } else {
                balas--;
                if (balas > 0) {
                    if (tiro < arvoreMarciano) {
                        System.out.println("Errou! Marciano: 'estou mais à direita'");
                    } else {
                        System.out.println("Errou! Marciano: 'estou mais à esquerda'");
                    }
                    System.out.println("Balas restantes: " + balas);
                }
            }
        }

        if (!acertou) {
            System.out.println("\nVocê foi levado para Marte! O marciano estava na árvore " + arvoreMarciano);
        }

        scanner.close();
    }
}