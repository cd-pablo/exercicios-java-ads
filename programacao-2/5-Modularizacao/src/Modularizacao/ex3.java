package src.Modularizacao;

public class ex3 {
    public static void main(String[] args) {
        System.out.println(maior(14, 3, 10));
    }

    static int maior(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
