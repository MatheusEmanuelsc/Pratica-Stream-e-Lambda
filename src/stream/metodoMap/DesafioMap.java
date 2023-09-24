package stream.metodoMap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8,9);

        Function<Integer,String> convertBinario= x-> Integer.toBinaryString(x);
        UnaryOperator<String> trocarOrdem= x-> new StringBuilder(x).reverse().toString();
        Function<String,Integer>recebeBinarioViraNumero = x-> Integer.parseInt(x,2);

        num.stream().map(convertBinario).map(trocarOrdem).map(recebeBinarioViraNumero).forEach(System.out::println);
    }
}
