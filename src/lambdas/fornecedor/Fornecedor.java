package lambdas.fornecedor;

import java.util.function.Supplier;

public class Fornecedor {

    public static void main(String[] args) {

        Supplier<String> olaMundo= ()-> "Ola Mundo ";
        //não recebe nada e retorna algo

        System.out.println(olaMundo.get());
    }
}
