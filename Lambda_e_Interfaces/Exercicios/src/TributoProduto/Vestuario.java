package TributoProduto;

public class Vestuario {
    public void Valor(Double valor){
        valor = valor + (valor * 0.025);
        System.out.printf("\nSeu produto de vestiario será:  %.2f%n", valor);
    }
}
