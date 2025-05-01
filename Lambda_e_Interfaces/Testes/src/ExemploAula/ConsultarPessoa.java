package ExemploAula;
import java.util.List;
import java.util.function.Function;

public class ConsultarPessoa {
     public static void main(String[] args) {
        List<Pessoa> pessoas = List.of(new Pessoa("Joaquim", 34), 
        new Pessoa("djdjjd", 34),
        new Pessoa("ssssssa", 34),
        new Pessoa("aaaaaa", 34));

        ImprimirDados(u ->"\n===============" + "\nNome: " + u.nome() + ", Idade: " + u.idade() , pessoas);


     }

     private static void ImprimirDados(Function<Pessoa, String> frase, List<Pessoa> pessoas){
        pessoas.forEach(u -> System.out.println(frase.apply(u)));
     }
}
