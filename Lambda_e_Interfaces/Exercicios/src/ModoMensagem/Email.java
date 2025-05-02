package ModoMensagem;

public class Email implements MensagemTexto {
    public void EnviarMensagem(String mensagem){
        System.out.println("Mnsagem e-mail: " + mensagem);
    }
}
