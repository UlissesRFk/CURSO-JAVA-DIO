package Set.OpBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
   private Set<Convidados> convidado;

   public ConjuntoConvidados(){
      this.convidado = new HashSet<>();
   }

   public void addConvidado(String nome, int CodigoConvite){
      convidado.add(new Convidados(nome,CodigoConvite));
   }

   public void removerConvidadoPorCodigoConvite(int codigoConvite){
      Convidados ConvidadoRemovido = null;
      for(Convidados c : convidado){
         if(c.getCodigoConvite() == codigoConvite){
         ConvidadoRemovido = c;
         }
      }
      convidado.remove(ConvidadoRemovido);
   }

   public int contarConvidados(){
      return convidado.size();
   }

   public void exibirConvidados(){
      System.out.println("Os convidados são: \n" + convidado);
   }

   public static void main(String[] args) {
      ConjuntoConvidados convidadosUnicos = new ConjuntoConvidados();

      convidadosUnicos.addConvidado("João", 0001);
      convidadosUnicos.addConvidado("Bianca", 0002);
      convidadosUnicos.addConvidado("Pedro", 0003);
      convidadosUnicos.addConvidado("Carla", 0004);

      System.out.println("\nQuantidade de convidados: " + convidadosUnicos.contarConvidados());
      convidadosUnicos.removerConvidadoPorCodigoConvite(0003);
      System.out.println("\nQuantidade de convidados: " + convidadosUnicos.contarConvidados());
      convidadosUnicos.exibirConvidados();


   }  
}
