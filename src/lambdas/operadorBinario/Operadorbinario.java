package lambdas.operadorBinario;

import java.util.function.BinaryOperator;

public class Operadorbinario {

    public static void main(String[] args) {

        BinaryOperator<Double> calculaMedia= (x,y)-> (x+y)/2;
        //recebe 2 parametros de mesmo tipo retorna do mesmo tipo

        System.out.println(calculaMedia.apply(10d,5d));

    }
}
