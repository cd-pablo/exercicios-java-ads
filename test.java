import java.util.*;

public class test {
    public static void main(String[] args) {

        String palavra = "ADD B 10 15";
        String[] pString = palavra.split(" ");


        if (pString[0].equals("ADD")) {
            int numero = Integer.parseInt(pString[2]);
            int numero2 = Integer.parseInt(pString[3]);

            int soma = numero + numero2;

            System.out.println(pString[1] + " = " + soma);
        }

    }
}
