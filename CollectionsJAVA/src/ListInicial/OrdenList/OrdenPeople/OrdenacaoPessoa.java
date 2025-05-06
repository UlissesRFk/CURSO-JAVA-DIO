package ListInicial.OrdenList.OrdenPeople;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaLista;

    private OrdenacaoPessoa(){
        this.pessoaLista = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaLista.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> OrdenarIdade(){
        List<Pessoa> pessoaIdade = new ArrayList<>(pessoaLista);
        Collections.sort(pessoaIdade);
        return pessoaIdade;
    }

    public List<Pessoa> OrdenarAltura(){
        List<Pessoa> pessoaAltura = new ArrayList<>(pessoaLista);
        Collections.sort(pessoaAltura, new ComparatorPorAltura());
        return pessoaAltura;
    }

    public static void main(String[] args){
        OrdenacaoPessoa pessoa = new OrdenacaoPessoa();

        pessoa.adicionarPessoa("João", 29, 1.89);
        pessoa.adicionarPessoa("Claudia", 18, 1.56);
        pessoa.adicionarPessoa("Marcos", 15, 1.69);

        System.out.println(pessoa.OrdenarIdade());
        System.out.println(pessoa.OrdenarAltura());
    }
}
