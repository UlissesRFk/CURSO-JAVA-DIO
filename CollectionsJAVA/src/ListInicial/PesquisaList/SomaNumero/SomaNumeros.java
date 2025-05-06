package ListInicial.PesquisaList.SomaNumero;

import java.util.ArrayList;
import java.util.List;


public class SomaNumeros {
    private List<Numero> numerosLista;

    public SomaNumeros(){
        this.numerosLista =  new ArrayList<>();
    }

    public void addNumero(int numero){
        numerosLista.add(new Numero(numero));
    }

    public void somarTodosNumeros(){
        int NumeroTotal = 0;
        if(!this.numerosLista.isEmpty()){
            for(Numero n : numerosLista){
               NumeroTotal += n.getNumero();
            }
        }
        System.out.println("\n O numero somado, ao final é: " + NumeroTotal);
    }

    public void listarNumeros(){
        if(!this.numerosLista.isEmpty()){
           System.out.println("Os numeros listados são: " + numerosLista); 
        }
    }

    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.addNumero(1);
        numeros.addNumero(2);
        numeros.addNumero(3);
        numeros.addNumero(4);
        numeros.addNumero(0);
        numeros.addNumero(0);
        numeros.addNumero(0);

        numeros.somarTodosNumeros();
        numeros.listarNumeros();
    }
}
