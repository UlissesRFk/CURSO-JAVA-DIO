import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();
        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();
        System.out.println("Digite a sua idade");
        int idade = scanner.nextInt();
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();


        System.out.println("O nome é " + nome + " " + sobrenome);
        System.out.println("A idade é " + idade + " e a altura é: " + altura);

    }
    
}
