package edu.Ulisses.TiposVariaveis.ProjetoTv;

public class SmartTv {
    //Ligar ou desligar | Mudar de canal | Aumentar ou diminuir
    boolean ligada = true;
    int canal = 3;
    int volume = 10;
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarCanal(){
        canal ++;
    }
    public void diminuirCanal(){
        canal --;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarVolume(){
        volume ++;
    }
    public void diminuirVolume(){
        volume --;
    }

}
