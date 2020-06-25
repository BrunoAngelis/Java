package br.com.abc.javacore.classesabstratas.classes;

public class Gerente extends Funcionario{

    public Gerente (String nome,String clt, double salario){
        super(nome,clt,salario);
    }

    public Gerente(){

    }

    @Override
    public void calculaSalario() {
        this.salario = this.salario +(this.salario * .20);
    }

    @Override
    public void imprime() {
        System.out.println("Imprime");
    }
}
