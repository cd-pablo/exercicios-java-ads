package src.Vetores;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double turmaNotas[] = new double[10];

        double alunoMaior = 0;
        double soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite as notas dos 10 alunos: ");
            turmaNotas[i] = sc.nextInt();
            if ( turmaNotas[i] > 7){
                alunoMaior = turmaNotas[i];
            }
            soma += turmaNotas[i];
        }
        double media = soma / 2;

        System.out.println("media da turma: " + media);
        System.out.println("Obtveram nota acima da média: " + alunoMaior);
        sc.close();
    }
}