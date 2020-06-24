package br.com.abc.javacore.heranca.classes;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    public void exibeDados() {
        super.exibeDados();
        System.out.println("Salario: " + this.salario);
        exibeReciboPagamento();

    }

    public void exibeReciboPagamento() {
        System.out.println("Eu " + super.nome + " rebeci o pagamento de " + this.salario);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
