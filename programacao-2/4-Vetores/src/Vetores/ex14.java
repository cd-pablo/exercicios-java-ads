package src.Vetores;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Random numeros = new Random();

        int[] rando = new int[7];

        for(int i = 0; i < 7;i++) {
            rando[i] = numeros.nextInt(50);
        }

        System.out.println("Vetor: "+ Arrays.toString(rando));

    }
}
