package ModoMensagem;

public class SMS implements MensagemTexto {
    public void EnviarMensagem(String mensagem){
        System.out.println("Mensagem de SMS --> " + mensagem);
    }
}
