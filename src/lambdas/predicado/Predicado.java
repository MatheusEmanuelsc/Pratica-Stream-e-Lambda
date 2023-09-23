package lambdas.predicado;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Predicate<Integer> eMaior= (x)-> x > 17;
        //Recebe um parametro de um tipo e retorna um boolean

        System.out.println("E maior de Idade: "+ eMaior.test(21));
        //.test para passar os parametros e testa.
    }
}
