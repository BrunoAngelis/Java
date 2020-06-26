package br.com.abc.javacore.testando.classes;

public class Gerente extends Funcionario {
    private double pl;

    public Gerente(String nome, String clt, double salario, double pl){
        super(nome,clt,salario);
        this.pl =  pl;
    }

    @Override
    public double calculaSalario(){
        return salario = salario + this.pl;
    }

    public double getPl() {
        return pl;
    }

    public void setPl(double pl) {
        this.pl = pl;
    }
}
