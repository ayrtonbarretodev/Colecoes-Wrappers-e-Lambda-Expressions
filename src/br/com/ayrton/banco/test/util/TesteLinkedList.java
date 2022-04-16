package br.com.ayrton.banco.test.util;

import br.com.ayrton.banco.modelo.Conta;
import br.com.ayrton.banco.modelo.ContaCorrente;
import br.com.ayrton.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.LinkedList;

public class TesteLinkedList {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(11,22);
        ContaPoupanca cp = new ContaPoupanca(33,44);
        ContaCorrente contaCorrente = new ContaCorrente(55,66);
        ContaPoupanca contaPoupanca = new ContaPoupanca(77,88);

        LinkedList<Conta> contaList = new LinkedList<>();
        contaList.add(cc);
        contaList.add(cp);
        contaList.add(contaCorrente);
        contaList.add(contaPoupanca);

        for (Conta conta:contaList) {
            System.out.println(conta.getAgencia());
            System.out.println(conta.getNumero());
        }

        System.out.println(contaList.size());

        Conta ref = contaList.get(0);
        //System.out.println(ref);

        contaList.remove(cp);

        for (Conta conta:contaList) {
            System.out.println(conta);
        }
    }
}