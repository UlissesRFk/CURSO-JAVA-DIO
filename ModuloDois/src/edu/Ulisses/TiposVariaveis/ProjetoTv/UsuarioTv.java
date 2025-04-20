package edu.Ulisses.TiposVariaveis.ProjetoTv;

public class UsuarioTv {
    public static void main(String[] args){
    SmartTv smartTv = new SmartTv();

    smartTv.ligar();
    smartTv.desligar();
    System.out.println(smartTv.ligada);

    smartTv.diminuirCanal();
    System.out.println(smartTv.canal);

    smartTv.mudarCanal(27);
    System.out.println(smartTv.canal);

    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    System.out.println(smartTv.canal);

    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    System.out.println(smartTv.volume);

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    System.out.println(smartTv.volume);
    }

}
