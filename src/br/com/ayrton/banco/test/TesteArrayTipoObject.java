package br.com.ayrton.banco.test;

import br.com.ayrton.banco.modelo.Cliente;
import br.com.ayrton.banco.modelo.Conta;
import br.com.ayrton.banco.modelo.ContaCorrente;
import br.com.ayrton.banco.modelo.ContaPoupanca;

public class TesteArrayTipoObject {
    public static void main(String[] args) {
        Object[] referencias = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        //System.out.println(referencias[1].getNumero());

        ContaPoupanca ref = (ContaPoupanca) referencias[1];
        /*Quando a referencia atribui um objeto mais genérico, precisamos fazer um cast indicando qual o tipo esperado a receber,
        pois o compilador não sabe. Nesse exemplo, a IDE não sabe que referencias[1] é do tipo ContaPoupanca */


        System.out.println(ref.getNumero());
        System.out.println(cc2.getNumero());
    }
}
