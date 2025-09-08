package src.Vetores;
import java.util.Arrays;

public class ex4 {
    public static void main(String[] args) {

        int numeros[] = new int[10];


        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                numeros[i] = 5;
            } else {
                numeros[i] = 3;
            }


        }
        System.out.println("Numeros: " + Arrays.toString(numeros));
    }
}