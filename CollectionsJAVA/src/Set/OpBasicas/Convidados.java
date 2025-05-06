package Set.OpBasicas;

public class Convidados {
    private String nome;
    private int CodigoConvite;

    public Convidados(String nome, int CodigoConvite){
        this.nome = nome;
        this.CodigoConvite = CodigoConvite;
    }

    public String getNome(){
        return nome;
    }
    public int getCodigoConvite(){
        return CodigoConvite;
    }

    public String toString() {
        return "\nNome: " + nome + " | Código: " + CodigoConvite;
    };

}
