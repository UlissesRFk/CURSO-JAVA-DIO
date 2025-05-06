package Set.OrdenacaoSet;

import java.util.Comparator;

public class Produtos implements Comparable<Produtos>{
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produtos(long codigo, String nome,double preco, int quantidade){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produtos p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public long getCodigo() {
        return codigo;
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

    @Override
    public String toString() {
        return "{ " + codigo + ", " + nome + ", " + preco + ", " + quantidade + "}" ;
    }
}

class ComparatorPorPreco implements Comparator<Produtos> {
 
    public int compare(Produtos p1, Produtos p2) {
       return Double.compare(p1.getPreco(), p2.getPreco());
    }
 }
