package Set.PesquisaSet.AgendaContatos;

import java.util.Objects;

public class Contatos {
    private String nome;
    private int numero;

    public Contatos(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (o instanceof Contatos) {
         Contatos contato = (Contatos)o;
         return Objects.equals(this.getNome(), contato.getNome());
      } else {
         return false;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.getNome()});
   }


    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        return "{ " + nome + ", " + numero + " }";
    }
}
