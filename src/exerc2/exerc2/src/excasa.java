import java.util.*;

public class excasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int sorteio = random.nextInt(5) + 1;

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

if(num == sorteio) {
            System.out.println("acertou!");
        } else if (num < sorteio) {
            System.out.println("O número sorteado era maior que o digitado = " +sorteio);
        } else {
            System.out.println("O número sorteado era menor que o digitado = " +sorteio);
        }


        scanner.close();
    }
} 