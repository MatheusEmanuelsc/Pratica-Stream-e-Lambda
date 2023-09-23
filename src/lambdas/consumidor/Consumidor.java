package lambdas.consumidor;

import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        Consumer<String> imprimir = System.out::println;
        //receb um parametro e não retorna nada

        imprimir.accept("Ola mundo");
        //accept recebe um parametro e não retorna nada


    }
}
