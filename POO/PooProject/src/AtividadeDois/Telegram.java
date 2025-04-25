package AtividadeDois;

public class Telegram extends ServicoMensagem{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Telegram");
    }
    public void receberMensagem(){
        System.out.println("Telegram");
    }
}
