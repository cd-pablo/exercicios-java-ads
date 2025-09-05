import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {

        int numeros [] = new int[10];

int num =9;
        for (int i = 0; i < 10; i++) {
            numeros[i] = num--;


        }
        System.out.println("Numeros: "+ Arrays.toString(numeros));
    }
}