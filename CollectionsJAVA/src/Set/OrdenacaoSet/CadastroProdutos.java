package Set.OrdenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produtos> produtosSet;

    public CadastroProdutos(){
        this.produtosSet = new HashSet<>();
    }

    public void addProduto(long cod, String nome, double preco, int quantidade){
        produtosSet.add(new Produtos(cod,nome,preco,quantidade));
    }

    public Set<Produtos> exibirProdutosPorNome(){
        Set<Produtos> produtoPorNome = new TreeSet<>(produtosSet);
        return produtoPorNome;
    }

    public Set<Produtos> exibirProdutosPorPreco(){
        Set<Produtos> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(this.produtosSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos produto = new CadastroProdutos();

        produto.addProduto(0001,"Desinfetante",39.90, 3);
        produto.addProduto(0002,"Amaciante",28.00, 2);
        produto.addProduto(0003,"Desodorante",15.00, 1);
        produto.addProduto(0004,"Banana",37.90, 10);
        produto.addProduto(0005,"Ovo",20.00, 20);

        System.out.println("Nomes: " + produto.exibirProdutosPorNome());
        System.out.println("Preços: " + produto.exibirProdutosPorPreco());
    }
}
