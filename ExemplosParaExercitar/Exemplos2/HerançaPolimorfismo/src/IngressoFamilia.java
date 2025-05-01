import java.util.Scanner;

final class IngressoFamilia extends Ingresso {

  double novoValor;

  public void ValorIngressoFamilia() {
    Scanner quantidadeFamiliares = new Scanner(System.in);
    System.out.println("Digite a quantidade de pessoas da sua família: ");
    int quantidade = quantidadeFamiliares.nextInt();

    if (quantidade > 3) {
      novoValor = (getValor() * quantidade) - (getValor() * quantidade * 0.05);
      System.out.println("O valor do ingresso será de: " + getNovoValor());
    } else if (quantidade < 3 && quantidade >= 1) {
      novoValor = getValor() * quantidade;
      System.out.println("O valor do ingresso é: " + getNovoValor());
    }else
     return;
  }

  public double getNovoValor() {
    return novoValor;
  }

  public void setNovoValor(double novoValor) {
    this.novoValor = novoValor;
  }

}
