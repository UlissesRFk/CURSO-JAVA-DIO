package ModoMensagem;

public class RedesSociais implements MensagemTexto {
    public void EnviarMensagem(String mensagem){
        System.out.println("Mensagem via Rede Social --> " + mensagem);
    }
}
