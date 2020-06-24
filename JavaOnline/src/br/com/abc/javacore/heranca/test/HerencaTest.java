package br.com.abc.javacore.heranca.test;

import br.com.abc.javacore.heranca.classes.Endereco;
import br.com.abc.javacore.heranca.classes.Funcionario;
import br.com.abc.javacore.heranca.classes.Pessoa;

public class HerencaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Bruno","111");
        Endereco end = new Endereco();
        Funcionario f = new Funcionario("Bruno","123");



        end.setRua("Rua do mato");
        end.setBairro("Mato Grosso");
        p.setEndereco(end);
        p.exibeDados();

        System.out.println("--------------");

        f.setSalario(4000);
        f.setEndereco(end);
        f.exibeDados();


    }
}

