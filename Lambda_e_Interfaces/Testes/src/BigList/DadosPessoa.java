package BigList;

import java.util.ArrayList;
import java.util.*;

public class DadosPessoa {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("João", 17, "joao.fabio@123"));
        pessoas.add(new Pessoa("sla", 17, "joao.fabio@123"));
        pessoas.add(new Pessoa("ola", 17, "joao.fabio@123"));

        for(Pessoa p : pessoas){
            p.exibirDados();;
        }


    }

}
