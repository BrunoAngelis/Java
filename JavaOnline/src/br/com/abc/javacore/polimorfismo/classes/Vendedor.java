package br.com.abc.javacore.polimorfismo.classes;

public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor(String nome, String clt, double salario, double totalVendas ){
        super(nome,clt,salario);
        this.totalVendas = totalVendas;
    }


    @Override
    public void calcularPagamento() {
        this.salario = this.salario + (totalVendas *.05);
    }


    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }


}
