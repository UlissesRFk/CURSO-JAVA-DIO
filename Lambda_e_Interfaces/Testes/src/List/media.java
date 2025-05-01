package List;

import java.util.ArrayList;
import java.util.*;

public class media {
    public static void main(String[] args) {

        List<Double> media = new ArrayList<>();
        media.add(10.0);
        media.add(5.5);

        double soma = 0;
        for (double nota : media) {
            soma += nota;
        }

        double mediaFinal = soma / media.size();

        if (mediaFinal >= 7) {
            System.out.println("\nA média é: " + mediaFinal);
        } else
            System.out.println("\nA media foi baixa!\n" + mediaFinal);

    }
}
