package DIO.SpringBoot;

import org.springframework.stereotype.Component;

@Component
public class Calculador {
    public int somar(int numero1, int numero2){
        return numero1 + numero2;
    }
}
