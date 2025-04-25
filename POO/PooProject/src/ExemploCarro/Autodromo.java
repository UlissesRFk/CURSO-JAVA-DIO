package ExemploCarro;
public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        Moto GTX = new Moto();
        jeep.ligar();
        GTX.ligar();
        jeep.setPlaca("33U9");
        GTX.setPlaca("3329G");
        System.out.println("A placa da GTX é " + GTX.getPlaca());
        System.out.println("A placa do jeep  é " + jeep.getPlaca());
    }
   
}
