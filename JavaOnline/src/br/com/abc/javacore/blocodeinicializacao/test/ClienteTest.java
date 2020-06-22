package br.com.abc.javacore.blocodeinicializacao.test;

import br.com.abc.javacore.blocodeinicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String [] args){

        Cliente cliente = new Cliente();

        System.out.print("Parcelas: ");

        for (int parcela : cliente.getParcelas()){

            System.out.print(" "+parcela);
        }


    }
}
