import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerExemplo {
    public static void main(String[] args) throws Exception {
        List<Integer> numerosPares = Arrays.asList( 0,2,3,4,5,6,7,8,9,10,13,15,17,19);

        //Lógica inicial do consumer | Consumer com expreções Lambdas
       /* Consumer<Integer> exibirNumerosPares = numerosPares -> {
            if(numerosPares % 2 == 0){
                System.out.println(numerosPares);
            }

        numerosPares.stream().forEach(exibirNumerosPares);
        } */ 

        //Consumer para imprimir dados no Stream
        /* numerosPares.stream().forEach(new Consumer<Integer>() ){
            public void accept(Integer n){
                if(n % 2 ==0){
                    System.out.println(n);
                }
            }
        } */

        numerosPares.stream().forEach(n -> {
            if(n % 2 == 1){
                System.out.println(n);
            }
        });
    }
}
