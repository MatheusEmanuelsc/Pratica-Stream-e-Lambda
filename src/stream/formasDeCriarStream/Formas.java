package stream.formasDeCriarStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Formas {

    public static void main(String[] args) {

        Consumer<String>print= System.out::println;

        System.out.println("----------------forma 1--------------------");
        Stream<String>lags= Stream.of("java","lua","php","ruby","js");
        lags.forEach(print);

        System.out.println("----------------Forma 2--------------------");
        String[] maisLags={"R","python","c","C++","C#"};
        Arrays.stream(maisLags).forEach(print);

        System.out.println("----------------Forma 3--------------------");
        List<String>outrasLags =Arrays.asList("go","zing","cobol","sql","type");
        outrasLags.stream().forEach(print);


    }
}
