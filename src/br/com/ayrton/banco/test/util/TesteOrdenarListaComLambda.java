package br.com.ayrton.banco.test.util;

import br.com.ayrton.banco.modelo.Cliente;
import br.com.ayrton.banco.modelo.Conta;
import br.com.ayrton.banco.modelo.ContaCorrente;
import br.com.ayrton.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class TesteOrdenarListaComLambda {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);


        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        //Classes anônimas
        //O java por debaixo dos panos gera uma classe e essa classe implementa o método compare


        //modo 2 - mais simplificado
        lista.sort(new Comparator<Conta>() {
            @Override
            public int compare(Conta o1, Conta o2) {
                return Integer.compare(o1.getNumero(), o2.getNumero());
            }
        });

        //Com Lambda
        lista.sort((o1, o2) -> Integer.compare(o1.getNumero(), o2.getNumero()));
        System.out.println("Teste forEach mais simplificado - interface Interable");
        lista.forEach(System.out::println);

        System.out.println();

        // Com lambda
        Comparator<Conta> comparator = (c1, c2) -> {
            String nomeC1 = c1.getTitular().getNome();
            String nomeC2 = c2.getTitular().getNome();
            return nomeC1.compareTo(nomeC2);
        };

        lista.sort(comparator);

        System.out.println("For normal");
        for (Conta conta : lista) {
            System.out.println(conta + ", Nome: " + conta.getTitular().getNome());
        }

        System.out.println();

        System.out.println("Teste método forEach normal - interface Interable");
        lista.forEach(conta -> System.out.println(conta + ", Nome: " + conta.getTitular().getNome()));


        System.out.println();

        System.out.println();
        Iterator<Conta> it = lista.iterator();
        while (it.hasNext()){ //hasNext: Retorna true se a iteração tiver mais elementos.
            System.out.println(it.next()); //next: Retorna o próximo elemento na iteração.
        }

    }
}