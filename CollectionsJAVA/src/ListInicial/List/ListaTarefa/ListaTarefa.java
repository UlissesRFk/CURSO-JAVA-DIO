package ListInicial.List.ListaTarefa;
import java.util.List;
import java.util.ArrayList;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasRemover);
    }

    public int NumeroTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoes(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args){
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("Hellow, World");
        listaTarefa.adicionarTarefa("Hellow, World");
        listaTarefa.adicionarTarefa("Ola mundo");
        listaTarefa.obterDescricoes();
        
        listaTarefa.removerTarefa("Hellow, World");
        listaTarefa.obterDescricoes();
        System.out.println("O numero de tarefas é: "+ listaTarefa.NumeroTarefas());
    }
}
