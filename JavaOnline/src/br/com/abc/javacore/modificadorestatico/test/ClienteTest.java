package br.com.abc.javacore.modificadorestatico.test;


import br.com.abc.javacore.modificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String [] args){

        Cliente cliente = new Cliente();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        System.out.print("Parcelas: ");

        for (int parcela : cliente.getParcelas()){

            System.out.print(" "+parcela);
        }


    }
}
