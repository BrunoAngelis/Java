package br.com.abc.javacore.polimorfismo.test;

import br.com.abc.javacore.polimorfismo.classes.Gerente;
import br.com.abc.javacore.polimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.polimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {

        Gerente g = new Gerente("Ana", "1212-1", 5000, 2000);
        Vendedor v = new Vendedor("Vitoria", "111-2", 1800, 15000);
        RelatorioPagamento rel = new RelatorioPagamento();

        rel.reletorioGenerico(g);
        System.out.println("--------------");
        rel.reletorioGenerico(v);
    }
}
