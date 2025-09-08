package src.Vetores;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomes[] = new String[7];

        for (int i = 0; i < 7; i++) {
            System.out.println("Digite o nome " + i + ":");
            nomes[i] = sc.nextLine();
        }

        for (int i = 6; i >=0 ; i--) { //percorre da posição 6 até o 0
            System.out.println(nomes[i]);

        }
        sc.close();

        //outra forma de fazer
        //System.out.println("Nomes: " + Arrays.toString(nomes));
        //Collections.reverse(Arrays.asList(nomes));
        //System.out.println("Nomes invertidos: " + Arrays.toString(nomes));
    }
}
