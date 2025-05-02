package TributoProduto;

public class SaudeBemEstar {
    public void Valor(Double valor){
        valor = valor + (valor * 0.015);
        System.out.printf("\nSeu prduto de saude e bem estar é de:  %.2f%n" , valor);
    }
}
