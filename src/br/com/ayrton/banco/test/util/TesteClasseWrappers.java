package br.com.ayrton.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteClasseWrappers {
    public static void main(String[] args) {

        Integer numero = 29;

        List<Integer> numeros = new ArrayList<>();
        numeros.add(numero);

        Double num = 14.5;
        Integer numInt = num.intValue();
        System.out.println(numInt);

    }
}
