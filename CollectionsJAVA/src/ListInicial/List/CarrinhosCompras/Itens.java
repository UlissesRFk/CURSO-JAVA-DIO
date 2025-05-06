package ListInicial.List.CarrinhosCompras;

public class Itens {
    private String nome; 
    private double preco;
    private int quantidade;

    public Itens(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String toString() {
        return "Item{nome='" + this.nome + ", preco=" + this.preco + ", quant=" + this.quantidade + "}\n";
     }
}
