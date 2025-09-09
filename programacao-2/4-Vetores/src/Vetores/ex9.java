package src.Vetores;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] $sexos = new String[10];
        double[] $altura = new double[10];

        int sexoMasculino = 0;
        int $sexoFeminino = 0;
        double maiorAltura = 0;
        double maiorAltura1 = 0;

        for (int i = 0; i < 10; i++) {
            int i2 = i + 1;
            System.out.println("digite o " + i2 + "° " + "sexo");
            $sexos[i] = scanner.next();
            if ($sexos[i].equals("homem")) {

                sexoMasculino++;

            } else if ($sexos[i].equals("mulher")) {

                $sexoFeminino++;

            }
            System.out.println("digite o " + i2 + "° " + "altura");
            $altura[i] = scanner.nextDouble();
            if (i != 0) {
                if ($altura[i] > $altura[i - 1]) {
                    maiorAltura1 = $altura[i];
                } else {

                    maiorAltura1 = $altura[i - 1];
                }
                maiorAltura = maiorAltura1;
            }
        }
        System.out.println("masc: " + sexoMasculino + "\n" + "fem: " + $sexoFeminino + "\n" + "maior altura: " + maiorAltura);
    }
}
