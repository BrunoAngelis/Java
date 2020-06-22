package br.com.abc.javacore.sobrecargametodos.test;

import br.com.abc.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.insereDados("Bruno Garcia de Angelis", "111.222.333-44", 2.500,"11.222.888.10");
        funcionario.exibeDados();

    }
}
