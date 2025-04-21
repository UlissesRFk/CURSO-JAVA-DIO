import java.util.Scanner;

public class SwitchTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua veocidade");
        int velocidade = scanner.nextInt();

        if (velocidade <= 50) {
            switch (velocidade) {
                case 10: {
                    System.out.println("Você esta na marcha 01");
                    break;
                }
                case 20: {
                    System.out.println("Você esta na marcha 02");
                    break;
                }
                case 30: {
                    System.out.println("Você esta na marcha 03");
                    break;
                }
                case 40: {
                    System.out.println("Você esta na marcha 04");
                    break;
                }
                case 50: {
                    System.out.println("Você esta na marcha 05");
                    break;
                }
            }
        } else {
            System.out.println("Sua marcha é 5 e sua velocidade é maior que 50");
        }
    }
}
