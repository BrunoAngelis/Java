package br.com.abc.javacore.heranca.test;

import br.com.abc.javacore.heranca.classes.Endereco;
import br.com.abc.javacore.heranca.classes.Funcionario;
import br.com.abc.javacore.heranca.classes.Pessoa;

public class HerencaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Endereco end = new Endereco();
        Funcionario f = new Funcionario();

        p.setNome("Lucinei");
        p.setCpf("111.222.333.44");
        end.setRua("Rua do mato");
        end.setBairro("Mato Grosso");
        p.setEndereco(end);
        p.exibePessoa();
        System.out.println("--------------");
        f.setNome("Bruno");
        f.setCpf("111.222.333-44");
        f.setSalario(4000);
        f.setEndereco(end);
        f.exibePessoa();


    }
}

