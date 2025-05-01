package Strings;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class TesteString {

    public static void main(String[] args){
        Function<String, String> paraMaiusculo = ParaMaiusculo -> ParaMaiusculo.toUpperCase();
        String text = paraMaiusculo.apply("java");
        System.out.println(text);

        // Function | ULTILIZANDO A *toUpperCase* para transformar uma palavra toda em maiusculo
        Function<Double, Integer> intValue = i -> i.intValue();
        System.out.println(intValue.apply(8.53302));

        // Predicate | ULTILIZANDO A *startsWith* para selecionar pessoas que inciam com esse prefixo
        Predicate<String> comecaComA = a -> a.startsWith("Ab");
        System.out.println(comecaComA.test("Duda"));
        System.out.println(comecaComA.test("Abraão"));

        // Consumer | Muito ultilizado para imprimir "frases" prontas, digamos assim
        Consumer<String> imprimirNome = nome -> System.out.println("Olá, " + nome);
        imprimirNome.accept("Ulisses");




    
    }
}
