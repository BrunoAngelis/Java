package br.com.abc.javacore.polimorfismo.classes;

public class RelatorioPagamento {



    public void reletorioGenerico(Funcionario a){
        System.out.println("Gerando relatório de pagamento para vendedores");
        a.calcularPagamento();
        System.out.println("Nome: "+ a.getNome());
        System.out.println("Salario: "+ a.getSalario());
    }
}
