package br.com.abc.javacore.interfaces.test;

import br.com.abc.javacore.interfaces.classes.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto p = new Produto("McBook",3,12000);

        p.calcularImposto();
        p.calculaFrete();
        System.out.println(p);
    }
}
