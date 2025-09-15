package src.EstruturasDeRepeticao;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sequência de DNA (ex: A T C C G T T A A): ");
        String dna = scanner.nextLine();

        String rna = converterDNAparaRNA(dna);

        System.out.println("DNA: " + dna);
        System.out.println("RNA-m: " + rna);

        scanner.close();
    }

    public static String converterDNAparaRNA(String dna) {
        StringBuilder rna = new StringBuilder();
        String[] bases = dna.split(" ");

        for (String base : bases) {
            switch (base.toUpperCase()) {
                case "A": rna.append("U "); break;
                case "T": rna.append("A "); break;
                case "C": rna.append("G "); break;
                case "G": rna.append("C "); break;
                default: rna.append(base).append(" ");
            }
        }

        return rna.toString().trim();
    }
}