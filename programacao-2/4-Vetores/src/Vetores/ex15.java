package src.Vetores;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor30 = new int[30];
        Random rando = new Random();
        int quantidade = 0;

        System.out.println("\n digite um numero chave: ");
        int numerochave = scanner.nextInt();

        for(int i = 0; i < 30;i++) {

            vetor30[i] = rando.nextInt(1,15);
            if(numerochave == vetor30[i]) {

                quantidade++;

                System.out.println("posição da chave "+i);

            }

        }
        System.out.println("quantidade de numeros: "+quantidade);
        System.out.println("Vetor: "+ Arrays.toString(vetor30));
    }
}
