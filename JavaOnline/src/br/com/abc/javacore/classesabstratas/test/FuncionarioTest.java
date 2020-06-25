package br.com.abc.javacore.classesabstratas.test;

import br.com.abc.javacore.classesabstratas.classes.Gerente;
import br.com.abc.javacore.classesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Pablo","1010-10",4000);
        Vendedor v = new Vendedor("Barbara","1515-8",1500,40000);


        g.calculaSalario();
        v.calculaSalario();

        System.out.println(g);
        System.out.println(v);
    }
}
