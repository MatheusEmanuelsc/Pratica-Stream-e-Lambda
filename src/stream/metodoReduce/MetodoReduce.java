package stream.metodoReduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class MetodoReduce {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8,9);
        BinaryOperator <Integer>somaNumeros=(x,y)-> x+y;

        Optional<Integer> somaTotal= num.stream().reduce(somaNumeros);
        System.out.println(somaTotal);
        //nesse exemplo caso vc não passe o primeiro parametro vc vai receber de retorno Optional
        //a naõ ser que vc use o .get no final
        //mais no caso go get poderia ocorrer erros com null

        Integer total= num.stream().reduce(15,somaNumeros);
        System.out.println(total);
        //caso vc  passe o segundo vc recebe normal
    }
}
