package lambdas.operadorUnario;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        UnaryOperator<Integer> soma2= x-> x+2;
        //recebe um tipo e retorna o mesmo tipo

        System.out.println(soma2.apply(2));
    }
}
