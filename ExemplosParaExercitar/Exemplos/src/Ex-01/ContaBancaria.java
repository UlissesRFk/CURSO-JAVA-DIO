public class ContaBancaria {
    protected double saldo;
    private double dinheiro;
    protected boolean chequeEspecial;

    private double valorChequeEspecial;
    protected double valorNovoDinheiro;
    private double valorRetirado;
    private double valorBoleto;

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getDinheiro(){
        return dinheiro;
    }
    public void setDinheiro(double dinheiro){
        this.dinheiro = dinheiro;
    }
    public boolean getChequeEspecial(){
        return chequeEspecial; 
    }
    public void setChequeEspecial(boolean chequeEspecial){
        this.chequeEspecial = chequeEspecial;
    }
    protected double getvalorChequeEspecial(){
        return valorChequeEspecial; 
    }
    public void setvalorChequeEspecial(double valorChequeEspecial){
        this.valorChequeEspecial = valorChequeEspecial;
    }
    public double getValorNovoDinheiro(){
        valorNovoDinheiro = dinheiro + saldo;
        return valorNovoDinheiro;
    }
    public double getValorRetirado(){
        saldo = valorNovoDinheiro - valorRetirado;
        return valorRetirado;
    }
    public void setValorRetirado(double valorRetirado){
        this.valorRetirado = valorRetirado;
    }
    public double getValorBoleto(){
        saldo = saldo - valorBoleto;
        return valorBoleto;
    }
    public void setValorBoleto(double valorBoleto){
        this.valorBoleto = valorBoleto;
    }

    void ConsultarSaldo(){
        System.out.println("Seu saldo é:" + getSaldo());
    }
    void ConsultarChequeEspecial(){
        System.out.println("Seu cheque é de:" + getChequeEspecial());
    }
    void DepositarDinheiro(){
        System.out.println("O novo valor da sua conta é: " + getValorNovoDinheiro());
    }
    void SacarDinheiro(){
        System.out.println("O novo valor da sua conta é: " + getSaldo());
    }
    void PagarBoleto(){
        System.out.println("Seu boleto foi pago! " + getSaldo());
    }
    private void ValorChequeEspecial(){
        if(valorNovoDinheiro <= 500){
            valorChequeEspecial = 50;
            System.out.println("Seu cheque especial é de: "+ valorChequeEspecial);
        }else if(valorNovoDinheiro > 500)
            valorChequeEspecial = valorNovoDinheiro*50/100;
            System.out.println("Seu cheque especial é de: "+ valorChequeEspecial);
    }
    void VerificarChequeEspecial(){
        chequeEspecial = true;
        if(chequeEspecial == true)
        ValorChequeEspecial();
        else
        System.out.println("A sua conta não esta usando o cheque especial");
    }
}
