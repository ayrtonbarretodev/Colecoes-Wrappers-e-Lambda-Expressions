package br.com.ayrton.banco.test;

import br.com.ayrton.banco.modelo.Conta;
import br.com.ayrton.banco.modelo.ContaCorrente;
import br.com.ayrton.banco.modelo.ContaPoupanca;

public class TesteArrayMaisGenerico {
    public static void main(String[] args) {
        Conta[] contas = new Conta[5];

        ContaCorrente cc1 = new ContaCorrente(22,11);
        contas[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22,22);
        contas[1] = cc2;

        System.out.println(contas[1].getNumero());

        ContaPoupanca ref = (ContaPoupanca) contas[1];
        /*Quando a referencia atribui um objeto mais genérico, precisamos fazer um cast indicando qual o tipo esperado a receber,
        pois o compilador não sabe. Nesse exemplo, a IDE não sabe que contas[1] é do tipo ContaPoupanca */


        System.out.println(ref.getNumero());
        System.out.println(cc2.getNumero());
    }
}
