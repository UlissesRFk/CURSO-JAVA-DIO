package DIO.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
//Inicializar uma aplicação com comandos pelo container
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner{

    @Autowired
    private Calculador calculador;
    @Override
    public void run(String... args) {
        System.out.println("O resultado do calculo é: " + calculador.somar(16, 4));
    }
    
}
