public class ForTeste {
    public static void main(String[] args) {

        /*
         * for(int patinhos = 1; patinhos <= 10 ; patinhos++){
         * System.out.println("João contou: " + patinhos + " patinhos.");
         * }
         */

        /*
         * for (int x = 0; x < frutas.length; x++) {
         * System.out.println("Suas frutas são: " + x + " " + frutas[x]);
         * }
         */

         String nacionalidade[] = {"", "Brasileiro", "Argentina", "Japonesa", 
            "Italiana", "Alemã", "Canadense", "Marroquina"};
            for(int i = 1; i < nacionalidade.length +1 ; i++){
                System.out.println("As nacionalidades são:" + i + " " + nacionalidade[i]);
            }
    }
}
