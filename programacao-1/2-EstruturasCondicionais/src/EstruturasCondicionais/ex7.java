package src.EstruturasCondicionais;
//Número par ou ímpar, positivo ou negativo
// Faça um programa que leia um número e mostre uma mensagem indicando se este número é **par ou ímpar**, e se é **positivo ou negativo**.
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        if ( num %2 == 0) {
            System.out.println(num+" Este umero é par.");
        }
        if (num %2 != 1) {
            System.out.println(num+" Este número é impar.");
        }

    }
}