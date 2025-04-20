package edu.Ulisses.AnatomiaDasClasses;

public class MinhaClasse {
    public static void main(String[] args){
        String primeiroNome = "Ulisses";
        String segundoNome = "Ribeiro";
        String terceiroNome = "FerreiraAA";
        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome,terceiroNome);

        System.out.print(nomeCompleto);
    } 

    public static String nomeCompleto(String primeiroNome,String segundoNome, String terceitoNome){
        return "Seu nome completo é:" + primeiroNome.concat(" ").concat(segundoNome).concat(" ").concat(terceitoNome);
    }
}
