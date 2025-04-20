package edu.Ulisses.TiposVariaveis;

public class exemplo02 {
    public static void main(String[] args){
        int numero = - 5;
        System.out.println("Unários: " + ++ numero);

        //numero ++ tambem soma 1 -> numero = numero +1 
        int numero2 = 10;
        numero2 = numero2 * 10;
        System.out.println("Incremento: " + numero2);

        boolean variavel = false;
        variavel = !variavel;
        System.out.println("Teste de incremento também" + variavel);

        int a = 6;
        int b = 7;
        String resultado = a==b ? "verdadeiro" : "Falso";
        System.out.println(resultado); 
        

        //OPERADORES RELACIONAIS
        int numeroPrimeiro = 60;
        int numeroSegundo = 60;
        boolean simNao = numeroPrimeiro == numeroSegundo;

        String maior = numeroPrimeiro > numeroSegundo ? "O numero 01 é maior que o 2:" : "Algo deu errado";
        System.out.println(simNao);
        System.out.println(maior);

        String nomePrimeiroo = "Gabriel";
        String nomeSegundoo = new String("Gabriel");
        System.out.print(nomePrimeiroo.equals(nomeSegundoo));
        

        //OPERADORES LÓGICOS
        boolean verdadeiro =  false;
        boolean falso = true;

        if(verdadeiro && falso){
            System.out.println("Deu certo");
        }

        if(verdadeiro || falso){
            System.out.println("Deu certo o OU");
        }
    }
}
