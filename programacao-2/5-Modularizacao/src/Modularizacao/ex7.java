package src.Modularizacao;

public class ex7 {

    public static boolean vdd(int a, int b, int c) {
        return (a > b && b > c);
    }

    public static void main(String[] args) {
        System.out.println(vdd(10, 5, 6));  // false
        System.out.println(vdd(10, 8, 2));  // true
    }
}
