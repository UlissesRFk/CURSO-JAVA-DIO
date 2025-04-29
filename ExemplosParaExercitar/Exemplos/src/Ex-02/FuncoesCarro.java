import java.util.Scanner;

public class FuncoesCarro {
    private boolean ligado = false;
    private int marcha = 0;
    private double velocidade = 0;
    

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public boolean getLigado(){
        return ligado;
    }
    public void setMarcha(int marcha){
        this.marcha = marcha;
    }
    public int getMarcha(){
        return marcha;
    }
    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }
    public double getVelocidade(){
        return velocidade;
    }

    void LigarCarro(){
        this.ligado = true;  
        this.velocidade = 10;
        System.out.println(" \nO carro foi ligado");      
    }
    void DesligarCarro(){
        if (!ligado) {
            System.out.println("O carro ja esta desligado");
            return;
        }
        if(velocidade == 0 && marcha == 0){
        setLigado(false);
        System.out.println("Carro desligado");
    }
    }
    void DiminuirVelocidade(){
        if (!ligado) {
            System.out.println("Você precisa ligar o carro antes para realizar essa função.");
            return;
        }
        if(velocidade > 0)
        velocidade --;
        else
        System.out.println("A velocidade ja esta zerada");
        System.out.println("Agora a sua velocidade é: " + velocidade);
    }
    void VirarEsquerda(){
        if (!ligado) {
            System.out.println("Você precisa ligar o carro antes para realizar essa função.");
            return;
        }
        if(velocidade > 0 && velocidade <= 40){
            System.out.println("Você virou a esquerda");
        }else if (velocidade == 0)
        System.out.println("Sua velocidade esta zerada");
        else
        System.out.println("Sua velocidade esta muito alta");
    }
    void VirarDireita(){
        if (!ligado) {
            System.out.println("Você precisa ligar o carro antes para realizar essa função.");
            return;
        }
        if(velocidade > 0 && velocidade <= 40){
            System.out.println("Você virou a direita");
        }else if (velocidade == 0)
        System.out.println("Sua velocidade esta zerada");
        else
        System.out.println("Sua velocidade esta muito alta");
    };
    void VerificarVelocidade(){
        if (!ligado) {
            System.out.println("Você precisa ligar o carro antes para realizar essa função.");
            return;
        }
       System.out.println("Sua velocidade é: " + velocidade);
    }
    void TrocarMarcha(){
        Scanner valorMarcha = new Scanner(System.in);
        if (!ligado) {
            System.out.println("Você precisa ligar o carro antes para realizar essa função.");
            return;
        }
        System.out.println("Digite a marcha que será passada: ");
        int marchaPassada = valorMarcha.nextInt();
        if(marchaPassada == 0){
            this.marcha = 0;
            System.out.println("Seu carro esta no ponto morto");}
        else if(marchaPassada == 1 && velocidade > 0 && velocidade <= 20){
            this.marcha = 1;
            System.out.println("Marcha um passada");}
        else if(marchaPassada == 2 && velocidade > 20 && velocidade <= 40){
            this.marcha = 2;
            System.out.println("Marcha dois passada");}
        else if(marchaPassada == 3 && velocidade > 40 && velocidade <= 60){
            this.marcha = 3;
            System.out.println("Marcha três passada");}
        else if(marchaPassada == 4 && velocidade > 60 && velocidade <= 80){
            this.marcha = 4;
            System.out.println("Marcha quatro passada");}
        else if(marchaPassada == 5 && velocidade > 80 && velocidade <= 100){
            this.marcha = 5;
            System.out.println("Marcha cinco passada");}
        else if(marchaPassada == 6 && velocidade > 100 && velocidade <= 120){
            this.marcha = 6;
            System.out.println("Marcha seis passada");}
    }

    void Acelerar(){
        if (!ligado) {
            System.out.println("Você precisa ligar o carro antes para realizar essa função.");
            return;
        }
        if(marcha == 0)
        System.out.println("O carro esta no peso morto");
        else{
        this.velocidade++;
        System.out.println("Sua velocidade é: " + this.velocidade);
    }

    }
}
