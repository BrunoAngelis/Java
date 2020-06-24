package br.com.abc.javacore.sobrescrita.test;

import br.com.abc.javacore.sobrescrita.classes.Pessoa;

public class PessoaTest {

    public static void main(String[] args) {
    Pessoa p = new Pessoa();

    p.setNome("Bruno");
    p.setIdade(23);

    System.out.println(p);

    }
}
