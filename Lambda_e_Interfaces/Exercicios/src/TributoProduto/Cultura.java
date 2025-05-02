package TributoProduto;

public class Cultura {
    public void Valor(Double valor){
        valor = valor + (valor * 0.04);
        System.out.printf("\nSeu produto de cultura é:  %.2f%n" , valor);
    }
}
