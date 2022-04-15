package br.com.ayrton.banco.test;

public class TesteArrayPrimitivos {
    public static void main(String[] args) {
        int[] idades = new int[5];


        //preenchendo o array
        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }


        //imprimindo o array
        for (int idade : idades) {
            System.out.println(idade);
        }


        //acessando índice inexistente
        try {
            System.out.println(idades[64]);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("índice fora dos limites para o tamanho do array");
        }

        //retorna o tamanho do array
        System.out.println(idades.length);


    }
}
