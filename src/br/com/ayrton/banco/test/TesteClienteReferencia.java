package br.com.ayrton.banco.test;

import br.com.ayrton.banco.modelo.Cliente;

public class TesteClienteReferencia {
    public static void main(String[] args) {
        Cliente clienteNormal = new Cliente();
        clienteNormal.setNome("Flavio");

        Cliente clienteVip = new Cliente();
        clienteVip.setNome("Romulo");

        Object[] refs = new Object[5];
        refs[0]  = clienteNormal;
        refs[1]  = clienteVip;

        Cliente ref = (Cliente) refs[1];

        //System.out.println(refs[1].getNome());
        System.out.println(ref.getNome());
    }
}
