package stream.metodoFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class MetodoFilter {

    public static void main(String[] args) {

        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8,9);

        Predicate<Integer> verificarPar= x-> x%2==0;
        Function<Integer,String> informaPar= x-> "O numero: "+x +" e Par!!!";

        num.stream().filter(verificarPar).map(informaPar).forEach(System.out::println);
    }
}
