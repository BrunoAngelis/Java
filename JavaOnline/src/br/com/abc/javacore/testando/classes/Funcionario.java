package br.com.abc.javacore.testando.classes;

public abstract class Funcionario {

    protected String nome;
    protected String clt;
    protected double salario;

    @Override
    public String toString(){
        return "Funcionario "+this.nome+" CLT:"+this.clt+" Salario: " +this.salario;
    }

    public Funcionario(String nome, String clt, double salario){
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    public Funcionario() {
    }

    public abstract double calculaSalario();

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
