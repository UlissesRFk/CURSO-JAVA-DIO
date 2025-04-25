package AtividadeDois;

public class MSNMensenger extends ServicoMensagem{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Mensenger");
    }
    public void receberMensagem(){
        System.out.println("Mensenger");
    }
}
