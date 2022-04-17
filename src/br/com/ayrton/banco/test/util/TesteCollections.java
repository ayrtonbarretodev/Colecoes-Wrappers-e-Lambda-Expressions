package br.com.ayrton.banco.test.util;

import br.com.ayrton.banco.modelo.Cliente;
import br.com.ayrton.banco.modelo.Conta;
import br.com.ayrton.banco.modelo.ContaCorrente;
import br.com.ayrton.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteCollections {

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

        System.out.println("Antes da ordenação");
        for (Conta conta : lista) {
            System.out.println(conta);
        }

        System.out.println();

        //NumeroDaContaComparator comparator = new NumeroDaContaComparator();

        //lista.sort(new NumeroDaContaComparator(););

        //forma 1 - utilizada no Java 8
        lista.sort(new TitularDaContaComparator());

        System.out.println("Comparando depois da ordenação - método sort - Comparando por nome");
        for (Conta conta : lista) {
            System.out.println(conta + ", Nome: " + conta.getTitular().getNome());
        }

        System.out.println();

        System.out.println("Método rotate - rotaciona a lista");
        Collections.rotate(lista,3); //rotaciona 3 posições
        for (Conta conta : lista) {
            System.out.println(conta + ", Nome: " + conta.getTitular().getNome());
        }
        /*
        * distance = 1 saída: Paulo - Ana - Guilherme - Nico
        * distance = 2 saída: Nico - Paulo - Ana - Guilherme
        * distance = 3 saída: Guilherme - Nico - Paulo - Ana
        * */

        System.out.println();

        //forma 2 - utilizada antes do java 8
        Collections.sort(lista, new NumeroDaContaComparator());
        System.out.println("Comparando depois da ordenação - método sort da classe Collections - sobrecarga 2 - - Comparando por número");
        for (Conta conta : lista) {
            System.out.println(conta + ", Nome: " + conta.getTitular().getNome());
        }

        System.out.println();

        System.out.println("Comparando depois da ordenação - método sort da classe Collections - sobrecarga 1 - - Comparando por saldo");
        Collections.sort(lista);
        /* Nesse caso foi necessário implementar a interface Comparable na classe Conta e também o método compareTo
        * para que o sort saiba qual o modo de ordenação desejada pelo usuário, que nesse caso foi o saldo
        * */
        for (Conta conta : lista) {
            System.out.println(conta + ", Saldo: " + conta.getSaldo());
        }

        System.out.println();

        Collections.reverse(lista); // Inverte a ordem dos elementos na lista especificada.
        System.out.println("Método reverse da classe Collections - Comparando por número - Modo inverso");
        for (Conta conta : lista) {
            System.out.println(conta + ", Nome: " + conta.getTitular().getNome());
        }

        /*
         * Método sort: responsável por fazer a ordenação
         *
         * Método compare: responsável por definir o critério de ordenamento que, neste caso, é o atributo número.
         * */


        System.out.println();

        Collections.shuffle(lista); // Inverte a ordem dos elementos na lista especificada.
        System.out.println("Método shuffle da classe Collections - embaralha todos os elementos de uma lista");
        for (Conta conta : lista) {
            System.out.println(conta + ", Nome: " + conta.getTitular().getNome());
        }
    }
}

class TitularDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();
        return nomeC1.compareTo(nomeC2);
    }
}

class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta o1, Conta o2) {
        return Integer.compare(o1.getNumero(), o2.getNumero());
    }

}
