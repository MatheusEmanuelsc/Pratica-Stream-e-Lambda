package lambdas.biFuncao;

import java.util.function.BiFunction;

public class Bifuncao {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,String> compra= (x,y)-> "parabens vc ganhou "+(x+y);
        //recebe  3 tipos
        //tipo 1 e 2 são das varivaeis
        //e o tipo 3 e o retorno
        System.out.println(compra.apply(2,3));
    }
}
