package List;

import java.util.ArrayList;
import java.util.*;

public class Lista {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();

        
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Melancia");
        frutas.add("Acerola");
        frutas.add("Maçã");

        for(String fruta : frutas){
            System.out.println(fruta);
        }

        System.out.println("=====================\n" + frutas.size());

        System.out.println("\n"+ frutas.contains("Banana")  + "\n=====================");

        frutas.remove("Uva");

        for(String fruta : frutas){
            System.out.println(fruta);
        }

        System.out.println("=====================\n" + frutas.size());

    }
}
