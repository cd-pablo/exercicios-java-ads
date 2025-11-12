package src.Modularizacao;

public class ex6 {

    public static int  soma (int valor1,int valor2) {
           int soma = valor1 + valor2;
           if ( soma < 0){
               return 0;         }
           return soma;
    }

    public static void main(String[] args) {
        System.out.println(soma(-5, -5));

    }

}

