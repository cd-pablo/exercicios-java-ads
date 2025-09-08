package src.Vetores;
public class ex1 {
    public static void main(String[] args) {

        int numeros [] = new int[8];
        /*
        numeros[0] = 999;
        numeros[1] = 999;
        numeros[2] = 999;
        numeros[3] = 999;
        numeros[4] = 999;
        numeros[5] = 999;
        numeros[6] = 999;
        numeros[7] = 999;
        */

        for (int i = 0; i < 8; i++) {
            numeros[i] = 999;
        }

        for (int i = 0; i < 8; i++) {
            System.out.println("Numero da posição: "+i+": "+numeros[i]);

        }


    }
}