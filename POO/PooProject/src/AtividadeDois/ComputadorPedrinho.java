package AtividadeDois;

public class ComputadorPedrinho {
    public static void main(String[] args) {
       ServicoMensagem sm = null;

        String add = "face";
        if(add.equals("mensenger"))
        sm = new MSNMensenger();
        else if(add.equals("face"))
        sm = new FacebookMenseger();
        else if(add.equals("Telegram"))
        sm = new Telegram();

            sm.enviarMensagem();
            sm.receberMensagem();
    }  
}
