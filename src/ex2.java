import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {

        int numeros [] = new int[10];
        

        for (int i = 1; i < 10; i++) {
            numeros[0] = 5;
            numeros[i] = i * 5 + 5
            ;

        }
        System.out.println("Numeros: "+ Arrays.toString(numeros));

                //0:0x5=0
                //0:0x5+5=5
                //1:1x5
    }
}