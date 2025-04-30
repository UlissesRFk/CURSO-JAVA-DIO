import java.util.Scanner;

public class Cliente {
    public static void main(String[] args){
        Scanner tipoIngresso = new Scanner(System.in);
            IngressoFamilia ingressoFamilia = new IngressoFamilia();
            IngressoMeia ingressoMeia = new IngressoMeia();
            System.out.println("\nDigite o umero para escolher o ingresso escolhido? \n01 - Família \n02 - Meia");
            int ingresso = tipoIngresso.nextInt();
   
            switch (ingresso) {
                case 1:
                    ingressoFamilia.NomeFilme();
                    ingressoFamilia.EscolherFala();
                    ingressoFamilia.ValorIngressoFamilia();
                    System.out.println("\n==========================" + "\nSeu filme será:" + ingressoFamilia.getNome() + "\nIngressos: Família" + "\ne o valor total ficou: " + ingressoFamilia.getNovoValor() + "\n==========================\n");
                    break;

                case 2:
                    ingressoMeia.NomeFilme();
                    ingressoMeia.EscolherFala();
                    ingressoMeia.ValorIngressoMeia();
                    System.out.println("\n==========================" + "\nSeu filme será:" + ingressoMeia.getNome() + "\nIngressos: Meia" + "\ne o valor total ficou: " + ingressoMeia.getNovoValor() + "\n==========================\n");
                    break;
            }
        }
}