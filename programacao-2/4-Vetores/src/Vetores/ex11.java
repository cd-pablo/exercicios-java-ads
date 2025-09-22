package src.Vetores;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int maiorQue30 = 0 ;

        for (int i = 0; i < 10; i++) {
            System.out.println("\n informe a idade de 10 pessoas:  ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] >= 30){
                System.out.println("maior que 30");
                maiorQue30++;
            }
        }


        System.out.println("Idade superior a 30: "+maiorQue30);
    }
}