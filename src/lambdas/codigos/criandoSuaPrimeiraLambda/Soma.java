package lambdas.codigos.criandoSuaPrimeiraLambda;
@FunctionalInterface//isso  faz com que ela se torne um Interface funcional
//pois ela limita apenas um metodo por Interface
public interface Soma {

    public Integer soma(Integer x,Integer y);
}


//Obs ela continua aceitando metodo defaul ,porem vc so pode ter 1 metodo abstrato