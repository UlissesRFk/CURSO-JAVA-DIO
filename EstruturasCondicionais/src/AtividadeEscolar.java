public class AtividadeEscolar {
    public static void main(String[] args) {

        int nota = 2;

        if(nota > 7){
            System.out.println("Você foi aprovado!");
        }else if(nota == 6){
            System.out.println("Você vai fazer o teste de ponto extra");
        }else{
            System.out.println("Você foi reprovado!");         
        }

         //CONDIÇÃO TERNÁRIA
        /*
         * int nota = 3;
         * String resultado = nota >= 7 ? "Você foi aprovado" : nota == 6 ? "VocÊ vai fazer a prova de ponto extra" : "Você foi reprovado";
         * System.out.println(resultado);
         */

    }
}
