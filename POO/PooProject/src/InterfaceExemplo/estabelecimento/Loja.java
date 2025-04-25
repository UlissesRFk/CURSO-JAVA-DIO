package InterfaceExemplo.estabelecimento;

import InterfaceExemplo.equipamentos.copiadora.Copiadora;
import InterfaceExemplo.equipamentos.impressora.Deskjet;
import InterfaceExemplo.equipamentos.impressora.Impressora;
import InterfaceExemplo.equipamentos.multiFuncional.produtosMultifuncinal;

public class Loja {
    public static void main(String[] args) {
        Copiadora impressora = new produtosMultifuncinal();
        impressora.copiar();

    }
}
