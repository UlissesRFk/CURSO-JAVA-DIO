package AtiviadeBanco;
import java.util.Scanner;

public class ExtraçaoBancaria {
    Scanner scanner = new Scanner(System.in);
    double saldo;

    public void SolicitarSaldo(){
        System.out.println("Seu saldo é R$" + saldo + "\nQuanto você quer sacar?");
        double valorSolicitado = scanner.nextDouble();

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado ;
            System.out.println("Seu novo saldo agora é:" + saldo);
        }else
            System.out.println("Saldo insuficiente!");
        
    }

    public void AdicionarSaldo(){
        System.out.println("Digite seu adicional");
        double adicionalSaldo = scanner.nextDouble();

        saldo = saldo + adicionalSaldo;
        System.out.println("Seu saldo agora é:" + saldo);
    }
}
