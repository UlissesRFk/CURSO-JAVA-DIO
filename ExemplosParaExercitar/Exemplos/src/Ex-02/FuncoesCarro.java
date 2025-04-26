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

    public void LigarCarro(){
        ligado = true;  
        System.out.println(" \nO carro foi ligado");      
    }
    public void DesligarCarro(){
        if (!ligado) {
            System.out.println("O carro ja esta desligado");
            return;
        }
        if(velocidade == 0 && marcha == 0);
        System.out.println("Carro desligado");
    }
    public void DiminuirVelocidade(){
        this.velocidade = velocidade;
        if (!ligado) {
            System.out.println("Você precisa ligar o carro antes para realizar essa função.");
            return;
        }
        velocidade--;
        System.out.println("Agora a sua velocidade é: " + velocidade);
    }
    public void VirarEsquerda(){
        if (!ligado) {
            System.out.println("Você precisa ligar o carro antes para realizar essa função.");
            return;
        }
        if(velocidade == 1 && velocidade <= 40){
            System.out.println("Você virou a esquerda");
        }else
        System.out.println("Sua velocidade esta muito alta");
    }
    public void VirarDireita(){
        if (!ligado) {
            System.out.println("Você precisa ligar o carro antes para realizar essa função.");
            return;
        }
        if(velocidade == 1 && velocidade <= 40){
            System.out.println("Você virpu a direita");
        }else
        System.out.println("Sua velocidade esta muito alta");
    };
    public void VerificarVelocidade(){
        if (!ligado) {
            System.out.println("Você precisa ligar o carro antes para realizar essa função.");
            return;
        }
       System.out.println("Sua velocidade é: " + velocidade);
    }
    public void TrocarMarcha(double velocidade){
        this.velocidade = velocidade;
        if (!ligado) {
            System.out.println("Você precisa ligar o carro antes para realizar essa função.");
            return;
        }
        if(velocidade == 0)
            marcha = 0;
        else if(velocidade > 0 && velocidade <= 20)
            marcha = 1;
        else if(velocidade > 20 && velocidade <= 40)
            marcha = 2;
        else if(velocidade > 40 && velocidade <= 60)
            marcha = 3;
        else if(velocidade > 60 && velocidade <= 80)
            marcha = 4;
        else if(velocidade > 80 && velocidade <= 100)
            marcha = 5;
        else if(velocidade > 100 && velocidade <= 120)
            marcha = 6;

        switch (marcha) {
            case 0:
                System.out.println("Seu carro esta no ponto morto");
                break;

            case 1:
            System.out.println("Sua velocidade pode estar entre 0km e 20km");
            break;

            case 2:
            System.out.println("Sua velocidade pode estar entre 21km e 40km");
            break;

            case 3:
            System.out.println("Sua velocidade pode estar entre 41km e 60km");
            break;

            case 4:
            System.out.println("Sua velocidade pode estar entre 61km e 80km");
            break;

            case 5:
            System.out.println("Sua velocidade pode estar entre 81km e 100km");
            break;

            case 6:
            System.out.println("Sua velocidade pode estar entre 101km e 120km");
            break;

        }
    }
    public void Acelerar(){
        this.velocidade = velocidade;
        if (!ligado) {
            System.out.println("Você precisa ligar o carro antes para realizar essa função.");
            return;
        }
        if(marcha == 0)
        System.out.println("O carro esta no peso morto");
        else{
        velocidade++;
        System.out.println("Sua velocidade é: " + velocidade);
    }

    }
}
