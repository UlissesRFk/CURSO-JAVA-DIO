package BigList;

public class Pessoa {
    String name;
    int idade;
    String email;

    public Pessoa(String name, int idade, String email) {
        this.name = name;
        this.idade = idade;
        this.email = email;
    }

    public void exibirDados() {
        System.out.println("\nNome: " + name);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
        System.out.println("================");
    }
}
