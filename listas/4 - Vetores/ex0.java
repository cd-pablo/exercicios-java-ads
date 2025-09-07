public class ex0 {
    public static void main(String[] args) {

        //int[] idades ={32,42,55,13,52};   <- ja atribuido
        //String nomes[]= {"pablo","luiza,filipi,marcio,allan"}; <- ja atribuido

        //declarar e alocar
        String nomes [] = new String[5];
        int idades [] = new int[5];

        //guardar
        idades[0] = 13;
        idades[1] = 11;
        idades[2] = 10;
        idades[3] = 12;
        idades[4] = 15;

        nomes[0]= "pablo";
        nomes[1]= "luiza";
        nomes[2]= "filipi";
        nomes[3]= "marcio";
        nomes[4]= "allan";

        for (int i = 0; i < 5; i++) {
            System.out.println("nome:"+ nomes[i] +"\nidade: "+ idades[i]);
        }


        // pega todos os eementos do inicio ao fim ( nao precisa de chave)
        for( int a : idades){
            System.out.println(a);
        }




    }
}