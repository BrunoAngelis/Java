package br.com.abc.javacore.testando.test;

import br.com.abc.javacore.testando.classes.Controle;
import br.com.abc.javacore.testando.classes.Gerente;
import br.com.abc.javacore.testando.classes.Vendedor;

public class ControleTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Bruno","1212-1",5000,2000);
        Vendedor v = new Vendedor("Gerson","1111-1",2000,15000);
        Controle controle = new Controle();

        controle.controleUniversal(g);
        controle.controleUniversal(v);
    }
}
