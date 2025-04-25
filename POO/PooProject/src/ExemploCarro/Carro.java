package ExemploCarro;
public class Carro extends Veiculo{
    public void ligar(){
        ConferirCombustivel();
    }

    private void ConferirCombustivel(){
        boolean tanque = true;
        if(tanque == true){
        ConferirCambio();
        System.out.println("Carro ligado!");}
        else
        System.out.println("O tanque esta vazio"); 
    }
    
    private void ConferirCambio(){
        System.out.println("Cambio configurado");
    }
}
