package lambdas.codigos.criandoSuaPrimeiraLambda;

public class PrimeiraLambda {

    public static void main(String[] args) {

       Soma calcular= (x,y)-> x+y;

    /* Outras forma de escrever
    *
    * Forma normal
    *
    * Soma soma= (x,y)->{
    *   return x+y;
    * }
    *
    * caso so a sua lambda recebe apenas o parametro pode  tira os
    * pareteses do parametros
    * */

        System.out.println(calcular.soma(1,2));

        //soma refente a Interface
        //e calcular  foi aonde implementou e salvou
    }
}
