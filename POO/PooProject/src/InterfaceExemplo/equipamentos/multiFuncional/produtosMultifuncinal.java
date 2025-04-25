package InterfaceExemplo.equipamentos.multiFuncional;

import InterfaceExemplo.equipamentos.copiadora.Copiadora;
import InterfaceExemplo.equipamentos.digitalizadora.Digitalizadora;
import InterfaceExemplo.equipamentos.impressora.Impressora;

public class produtosMultifuncinal implements Digitalizadora,Copiadora,Impressora {
    public void digitalizar(){
        System.out.println("Digitalizando Multifuncional");
    }
    public void copiar(){
        System.out.println("Copiando Multifuncional");
    }
    public void imprimir(){
        System.out.println("Imprimindo Multifuncional");
    }
}
