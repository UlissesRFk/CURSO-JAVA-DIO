package Set.PesquisaSet.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
   private Set<Contatos> contatosSet;

   public AgendaContatos(){
    this.contatosSet = new HashSet<>();
   }

   public void addContatos(String nome, int numero){
    contatosSet.add(new Contatos(nome, numero));
   }

   public void exibirContatos(){
    System.out.println("\nSeus contatos são: " + contatosSet);
   }

   public Set<Contatos> pesquisarPorNome(String nome){
    Set<Contatos> contatosPorNome = new HashSet<>();
        for(Contatos c : contatosSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
    }
    return contatosPorNome;
}

    public Contatos atualizarNumeroContato(String nome, int novoNumero){
        Contatos atualizarNovoContato = null;
        for(Contatos c : contatosSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                atualizarNovoContato = c;
                break;
            }
        }
        return atualizarNovoContato;
    }

    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();

        contatos.exibirContatos();
        contatos.addContatos("Maria", 99921317);
        contatos.addContatos("Ulisses", 209089760);
        contatos.addContatos("Ulisses", 37892718);
        contatos.addContatos("Claudia", 859121314);
        contatos.addContatos("Claudia fernandes", 34562781);
        contatos.exibirContatos();
        contatos.atualizarNumeroContato("Maria", 29288321);
        contatos.exibirContatos();
        System.out.println("Nomes: " + contatos.pesquisarPorNome("Claudia"));
    }
}
