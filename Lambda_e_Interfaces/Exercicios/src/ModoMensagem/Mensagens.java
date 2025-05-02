package ModoMensagem;

import java.util.Scanner;

public class Mensagens {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int opicao = 1;
        while (opicao >= 1 && opicao <= 4) {
            
            System.out.print("\nDigite a mensagem que você que enviar: ");
            String mensagem = scanner.nextLine();
            System.out.println("\n ============== Digite por onde você quer enviar ==============");
            System.out.println("01 - Sms");
            System.out.println("02 - Rede Social");
            System.out.println("03 - WhatsZap");
            System.out.println("04 - E-mail");
            System.out.println("05 - Sair");
            opicao = scanner.nextInt();
            scanner.nextLine();
           

            switch (opicao) {
                case 1:
                    MensagemTexto sms = new SMS();
                    sms.EnviarMensagem(mensagem);
                    break;
                case 2:
                    MensagemTexto rs = new RedesSociais();
                    rs.EnviarMensagem(mensagem);
                    break;
                case 3:
                    MensagemTexto ws = new WhatsZap();
                    ws.EnviarMensagem(mensagem);
                    break;
                case 4:
                    MensagemTexto email = new Email();
                    email.EnviarMensagem(mensagem);
                    break;
                case 5:
                    break;

            }

        }
    }

}
