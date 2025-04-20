package edu.Ulisses.AnatomiaDasClasses;

public class MinhaClasse {
    public static void main(String[] args){
        String primeiroNome = "Ulisses";
        String segundoNome = "Ribeiro";
        String terceiroNome = "Ferreira";
        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome,terceiroNome);

        System.out.print(nomeCompleto);
    }    

    public static String nomeCompleto (String primeiroNome, String segundoNome, String terceiroNome){
        return "Resultado:" + primeiroNome.concat(" ").concat(segundoNome).concat(" ").concat(terceiroNome);
    }

}
