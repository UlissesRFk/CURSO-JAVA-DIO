import java.util.Scanner;

public class Carro extends FuncoesCarro{
    public static void main(String[] args) {
        Scanner escolher = new Scanner(System.in);
        FuncoesCarro gol = new FuncoesCarro();
        int numeroEscolhido;
    do{
        System.out.println("\n ======== Escolha uma ação =========");
        System.out.println("01 - Ligar");
        System.out.println("02 - Passar marcha");
        System.out.println("03 - Verificar Velocidade");
        System.out.println("04 - Virar à esquerda");
        System.out.println("05 - Virar à direita");
        System.out.println("06 - Acelerar");
        System.out.println("07 - Diminuir velocidade");
        System.out.println("08 - Desligar Carro");
        System.out.println("00 - Sair");
        System.out.println("=================");
        numeroEscolhido = escolher.nextInt();     
        
        switch(numeroEscolhido) {
            case 1 -> gol.LigarCarro();

            case 2 -> gol.TrocarMarcha();

            case 3 -> gol.VerificarVelocidade();

            case 4 -> gol.VirarEsquerda();

            case 5 -> gol.VirarDireita();

            case 6 -> gol.Acelerar();

            case 7 -> gol.DiminuirVelocidade();
           
            case 8 -> gol.DesligarCarro();
        }
    }while (gol.getLigado() == true);
    }
  }

