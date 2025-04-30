public class IngressoMeia extends Ingresso {
    double novoValor;

    public void ValorIngressoMeia() {
        novoValor = getValor() / 2;
        System.out.print("O valor do seu ingresso é: " + getNovoValor());
    }

    public double getNovoValor() {
        return novoValor;
    }

    public void setNovoValor(double novoValor) {
        this.novoValor = novoValor;
    }
}
