package lambdas.funcao;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {
        Function<Integer,String> parOuImpar= x-> x % 2 == 0 ? "E par": "E impar";
        //Function recebe dois parametros de tipo
        // o primeiro para o tipo que ele vai receber
        //o segundo o tipo que ele vai retorna

        //e recebe um valor e retorna o resultado
        System.out.println(parOuImpar.apply(10));
        //nesse caso usa o apply


        //caso queria fazer composição andthen. compose
    }
}
