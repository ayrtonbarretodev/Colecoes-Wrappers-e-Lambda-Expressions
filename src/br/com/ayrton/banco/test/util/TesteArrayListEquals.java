package br.com.ayrton.banco.test.util;

import br.com.ayrton.banco.modelo.Conta;
import br.com.ayrton.banco.modelo.ContaCorrente;
import br.com.ayrton.banco.modelo.ContaPoupanca;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(11, 22);
        ContaPoupanca cp = new ContaPoupanca(33, 44);
        ContaPoupanca cpNew = new ContaPoupanca(33, 44);

        ArrayList<Conta> contaList = new ArrayList<>();
        contaList.add(cc);
        contaList.add(cp);

        boolean existe = contaList.contains(cp);
        System.out.println("Já existe: " + existe); //true

        boolean existe2 = contaList.contains(cpNew);
        System.out.println("Já existe: " + existe2); //false

        boolean eIgual = cp.equals(cpNew);
        System.out.println("Os objetos são iguais: " + eIgual);

        for (Conta conta : contaList) {
            System.out.println(conta);
        }
    }
}