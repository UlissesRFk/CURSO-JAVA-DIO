package CalcularNota;

public class App {
    public static void main(String[] args){
        Calcular soma = (a, b) -> a + b;
        double resultadoSoma = soma.calculo(3, 4);
        System.out.println("\n" + resultadoSoma);

        Calcular multip = (a,b) -> a * b;
        double resultadoMult = multip.calculo(3, 5);
        System.out.println("\n" + resultadoMult);

        Calcular subt = (a, b) -> a - b;
        double resultadoSubt = subt.calculo(2, 3);
        System.out.println("A soma é: " + resultadoSubt);
    }
}
