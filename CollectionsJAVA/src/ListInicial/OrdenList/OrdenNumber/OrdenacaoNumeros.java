package ListInicial.OrdenList.OrdenNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoNumeros {
    private List<Number> numeroLista;

    public OrdenacaoNumeros(){
        numeroLista = new ArrayList<>();
    }

    public void adicionarNumero(int number){
        numeroLista.add(new Number(number));
    }

    public List<Number> ordenarAscendente(){
        List<Number> ordenacaoAcendente = new ArrayList<>(numeroLista);
        Collections.sort(ordenacaoAcendente);
        return ordenacaoAcendente;
    }

    public List<Number> ordenarDescendente(){
        List<Number> ordenacaoDescendente = new ArrayList<>(numeroLista);
        ordenacaoDescendente.sort(Collections.reverseOrder());
        return ordenacaoDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(72);
        numeros.adicionarNumero(21);
        numeros.adicionarNumero(43);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(0);
        numeros.adicionarNumero(24);

       System.out.println("\nEm ordem crescente: " + numeros.ordenarAscendente());
       System.out.println("\nEm ordem decrescente: " + numeros.ordenarDescendente());
        
    }
}
