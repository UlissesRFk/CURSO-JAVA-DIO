package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produtos> produtosMap;

    public EstoqueProdutos(){
        this.produtosMap = new HashMap<>();
    }

    public void addProduto(long cod, String nome, double preco, int quantidade){
        produtosMap.put(cod, new Produtos(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(produtosMap);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        if(!produtosMap.isEmpty()){
            for(Produtos p: produtosMap.values()){
                valorTotal += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotal;
    }

    public Produtos produtoMaisBarato(){
        Produtos produtoMaisBarato = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produtos p : produtosMap.values()){
            if(p.getPreco() > maiorPreco){
                produtoMaisBarato = p;
            }
        }
        return produtoMaisBarato;

    }

    public Produtos produtoMaisCaro(){
        Produtos produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produtos p : produtosMap.values()){
            if(p.getPreco() > maiorPreco){
                maiorPreco = p.getPreco();
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }

    public double obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        double maiorValor = 0;
        if(!produtosMap.isEmpty()){
            for(Produtos p : produtosMap.values()){
                double valorTotalProduto = p.getPreco() * p.getQuantidade();
                if(valorTotalProduto > maiorValor)
                maiorValor = valorTotalProduto;
            }
        }
        return maiorValor;
    }

    public static void main(String[] args) {
        EstoqueProdutos produtos = new EstoqueProdutos();

        produtos.addProduto(2, "Carne", 23.30, 01);
        produtos.addProduto(4, "arroz", 5.00, 4);
        produtos.addProduto(3, "Porco", 10.00, 03);
        

        produtos.exibirProdutos();
        System.out.println(produtos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
        System.out.println(produtos.calcularValorTotal());
        produtos.exibirProdutos();
        System.out.println("Mais barato: " + produtos.produtoMaisBarato());
        System.out.println("Mais caro: " + produtos.produtoMaisCaro()); 

    }
}
