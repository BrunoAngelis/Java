package br.com.abc.javacore.modificadorfinal.test;

import br.com.abc.javacore.modificadorfinal.classes.Carro;
import br.com.abc.javacore.modificadorfinal.classes.Comprador;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();

        System.out.println(c.getComprador());
        c.getComprador().setNome("Bruno");
        System.out.println(c.getComprador());

    }
}
