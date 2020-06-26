package br.com.abc.javacore.polimorfismo.classes;

public class Gerente extends Funcionario {
    private double pl;


    public Gerente (String nome,String clt, double salario,double pl){
        super(nome,clt,salario);
        this.pl = pl;
    }

    @Override
    public void calcularPagamento() {
        this.salario =  this.salario + pl;
    }


    public double getPl() {
        return pl;
    }

    public void setPl(double pl) {
        this.pl = pl;
    }
}
