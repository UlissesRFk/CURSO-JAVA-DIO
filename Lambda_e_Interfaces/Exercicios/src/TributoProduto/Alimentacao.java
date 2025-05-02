package TributoProduto;

public class Alimentacao implements ValorTributo{
    public void Valor(Double valor){
        valor = valor + (valor * 0.01);
        System.out.printf("\nSeu produto de Alimentação é:  %.2f%n" , valor);
    }
}
