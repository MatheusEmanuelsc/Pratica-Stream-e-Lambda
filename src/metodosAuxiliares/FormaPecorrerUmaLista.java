package metodosAuxiliares;

import java.util.Arrays;
import java.util.List;

public class FormaPecorrerUmaLista {

    public static void main(String[] args) {
        List<String>nomes= Arrays.asList("jao","bao","lao","zao","tao");//exemplo de array para pecorrer


        //forma foreach
        for (String nome: nomes){
            System.out.println("Oi: "+nome);
        }
        //forma utilizando lambdas
        nomes.forEach( System.out::println );


    }
}
