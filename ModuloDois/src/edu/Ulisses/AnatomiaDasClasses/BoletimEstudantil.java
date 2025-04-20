package edu.Ulisses.AnatomiaDasClasses;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 7;

        if(mediaFinal < 6)
            System.out.print("Você está reprovado");
        
        else if(mediaFinal == 6)
            System.out.print("Prova de recuperação");
        
        else
            System.out.print("Aprovado!");
        
    }
}