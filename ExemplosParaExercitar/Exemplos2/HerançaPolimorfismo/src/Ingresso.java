import java.util.Scanner;

sealed public class Ingresso permits IngressoFamilia, IngressoMeia {
    private double valor = 20;
    private String fala;
    private String nome;

    public String getFala() {
        return fala;
    }

    public void setFala(String fala) {
        this.fala = fala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
        System.out.println("O valor original do ingresso é: " + getValor());
    }

    void EscolherFala() {
        Scanner escolherFala = new Scanner(System.in);
        System.out.println("\nDigite 1 para o filme ser DUBLADO | Digite 2 para o filme ser LEGENDADO");
        int escolha = escolherFala.nextInt();

        if (escolha == 1) {
            this.fala = "Dublado";
            System.out.println("Seu filme será " + getFala());
        } else if (escolha == 2) {
            this.fala = "Legendado";
            System.out.println("Seu filme será " + getFala());
        } else
            System.out.println("Essa opção não é válida!");
    }

    void NomeFilme() {
        Scanner escolherFilme = new Scanner(System.in);
        do {
            System.out.println("===== Escolha o seu filme: =====");
            System.out.println("Filme 01");
            System.out.println("Filme 02");
            System.out.println("Filme 03");
            System.out.println("Filme 04");
            System.out.println("Filme 05");
            System.out.println("Filme 06");
            this.nome = escolherFilme.nextLine();

            switch (this.nome) {
                case "Filme 01" -> System.out.println("O Filme escolhido foi: " + this.nome);
                case "Filme 02" -> System.out.println("O Filme escolhido foi: " + this.nome);
                case "Filme 03" -> System.out.println("O Filme escolhido foi: " + this.nome);
                case "Filme 04" -> System.out.println("O Filme escolhido foi: " + this.nome);
                case "Filme 05" -> System.out.println("O Filme escolhido foi: " + this.nome);
                case "Filme 06" -> System.out.println("O Filme escolhido foi: " + this.nome);
                default -> System.out.println("Essa opção não está disponível");
                
            }

        } while (this.nome == null);
    }
}


