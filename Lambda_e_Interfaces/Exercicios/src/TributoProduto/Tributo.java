package TributoProduto;
import java.util.Scanner;

public class Tributo {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opicao = 1;

        while(opicao >= 1 && opicao <= 4){
            System.out.println("\n============= Digite o numero de qual será seu produto =============");
            System.out.println("01 - Alimentação");
            System.out.println("02 - Saude e bem estar");
            System.out.println("03 - Vestuario");
            System.out.println("04 - Cultura");
            System.out.println("05 - Sair");
            int saida = scanner.nextInt();

            if(opicao > 5 || opicao < 1 || opicao == 0){
                System.out.println("Digite um dos valores listados! ");
                continue;}

            switch (saida) {
                case 1:{PassarAlimentacao(); break;}
                case 2:{PassarSaudeBemEstar(); break;}
                case 3:{PassarVestuario(); break;}
                case 4:{PassarCultura(); break;}
                case 5: break;
            }

        }
    }

    public static void PassarAlimentacao(){
        Alimentacao alimentacao = new Alimentacao();
        System.out.println("\n- Digite o valor do produto: ");
        double valor = scanner.nextDouble();
        alimentacao.Valor(valor);
    }

    public static void PassarSaudeBemEstar(){
        SaudeBemEstar SBE = new SaudeBemEstar();
        System.out.println("\n- Digite o valor do produto: ");
        double valor = scanner.nextDouble();
        SBE.Valor(valor);
    }

    public static void PassarVestuario(){
        Vestuario vestuario = new Vestuario();
        System.out.println("\n- Digite o valor do produto: ");
        double valor = scanner.nextDouble();
        vestuario.Valor(valor);
    }

    public static void PassarCultura(){
        Cultura cultura = new Cultura();
        System.out.println("\n- Digite o valor do produto: ");
        double valor = scanner.nextDouble();
        cultura.Valor(valor);
    }
}
