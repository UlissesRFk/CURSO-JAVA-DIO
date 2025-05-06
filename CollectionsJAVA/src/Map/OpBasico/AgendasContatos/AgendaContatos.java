package Map.OpBasico.AgendasContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> AgendaContatoMap;

    public AgendaContatos(){
        this.AgendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        AgendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!AgendaContatoMap.isEmpty()){
            AgendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(AgendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroNome = null;
        numeroNome = AgendaContatoMap.get(nome);
        return numeroNome;
    }

    public static void main(String[] agrs){
        AgendaContatos contatos = new AgendaContatos();

        contatos.adicionarContato("Camila", 3728803);
        contatos.adicionarContato("Camila", 23265738);
        contatos.adicionarContato("joão", 123456);
        contatos.adicionarContato("Carlos", 32323232);

        contatos.exibirContatos();
        contatos.removerContato("joão");
        contatos.exibirContatos();
        System.out.println("O numero é: " + contatos.pesquisarPorNome("Carlos"));
    }
}
