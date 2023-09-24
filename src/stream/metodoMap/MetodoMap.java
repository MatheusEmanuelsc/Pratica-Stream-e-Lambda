package stream.metodoMap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class MetodoMap {
    public static void main(String[] args) {

        UnaryOperator<String> transformaMaiscula = x-> x.toUpperCase();
        Consumer<String>print= System.out::println;

        List<String>nomes= Arrays.asList("jao","bao","zao","tao","lao");
        nomes.stream().map(transformaMaiscula).forEach(print);

       //map recebe um funcao no qual permite mapear os dados  e trsnaformalo em outra sequencia de dados
        // gerando assim um novo stream
        //inclusive vc pode encadear map



    }
}
