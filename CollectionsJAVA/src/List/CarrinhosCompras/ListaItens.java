package List.CarrinhosCompras;

import java.util.ArrayList;
import java.util.List;

public class ListaItens {
    private List<Itens> itensLista = new ArrayList<>();

    public ListaItens(){}

    public void adicionarItem(String nome, double preco, int quantidade){
            Itens item = new Itens(nome,preco,quantidade);
            if(quantidade == 0)
            System.out.println("\nVocê não adicionou nenhuma quantidade ao carrinho");
            else
            this.itensLista.add(item);
    }

    public void removerItem(String nome){
        List<Itens> removerItemNome = new ArrayList<>();

        for(Itens l: this.itensLista){
          if(l.getNome().equalsIgnoreCase(nome)){
            removerItemNome.add(l);
          }
        }
        this.itensLista.removeAll(removerItemNome);
    }

    public void calcularValorTotal(){
        double valorTotal  = 0;
        for(Itens l : this.itensLista){
            valorTotal += l.getPreco() * l.getQuantidade();
        }
        System.out.println("Valor total é de: " + valorTotal);

       
    }

    public void exibirItens(){
        if(this.itensLista.size() == 0){
            System.out.println("\nAdicione algum iten no carinho!");
        }else if(this.itensLista.size() == 1)
        System.out.println("O item é: " + this.itensLista);
        else
        System.out.println("O item é: " + this.itensLista);
    }

    public static void main(String[] args) {
        ListaItens listaItens = new ListaItens();

        listaItens.adicionarItem("Mamão", 40.00, 2);
        listaItens.adicionarItem("Mamão", 20.00, 2);
        listaItens.adicionarItem("Mamão", 50.00, 4);
        listaItens.exibirItens();
        listaItens.calcularValorTotal();
    }
}


