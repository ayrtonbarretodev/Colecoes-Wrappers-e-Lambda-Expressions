package br.com.ayrton.banco.test;

import br.com.ayrton.banco.modelo.Pessoa;
import br.com.ayrton.banco.modelo.User;

public class TesteUser {
    public static void main(String[] args) {
        User userA = new User("Ayrton", "Barreto");
        User userB = new User("Ayrton", "Barreto");


        System.out.println("COM EQUALS E HASHCODE SOBRESCRITOS");
        System.out.println(userA);
        System.out.println(userA.hashCode());
        System.out.println(userB);
        System.out.println(userB.hashCode());
        System.out.println(userA.equals(userB));

        /* O equals quando não é sobrescrito, compara os hashcodes do objeto, por isso o resultado é false */

        /*
        Porém, ao sobrescrever o equals na classe User, ele passará a comparar os atributos da classe User, por isso deu true,
        visto que o atributo nome e o sobrenome dos 2 objetos são iguais
        */
        System.out.println();

        System.out.println("SEM EQUALS E HASHCODE SOBRESCRITOS");
        Pessoa p1 = new Pessoa("Ayrton", "Barreto");
        Pessoa p2 = new Pessoa("Ayrton", "Barreto");
        System.out.println(p1);
        System.out.println(p1.hashCode());
        System.out.println(p2);
        System.out.println(p2.hashCode());
        System.out.println(p1);
        System.out.println(p1.equals(p2));

    }
}
