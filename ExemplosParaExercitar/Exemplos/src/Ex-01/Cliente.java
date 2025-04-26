public class Cliente {
    public static void main(String[] args) {
        /*ContaBancaria nubank = new ContaBancaria();
        nubank.setSaldo(0);
        nubank.setDinheiro(52.90);
        nubank.setValorRetirado(2.90);
        nubank.setValorBoleto(70.00);

        System.out.println("Seu saldo é: " + nubank.getSaldo());
        System.out.println("O valor depositado foi: " + nubank.getDinheiro() + " e seu saldo agora é: " + nubank.getValorNovoDinheiro());
        System.out.println("O valor sacado foi: " + nubank.getValorRetirado() + " e seu novo saldo agora é: " + nubank.getSaldo());
        System.out.println("O valor do seu boleto é: " + nubank.getValorBoleto() + " e seu novo saldo agora é: " + nubank.getSaldo());
        */

        ContaBancaria nubank = new ContaBancaria();
        nubank.setSaldo(0);
        nubank.setDinheiro(3000);
        nubank.DepositarDinheiro();
        nubank.VerificarChequeEspecial();
    }
    
}
