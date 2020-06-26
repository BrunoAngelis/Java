package br.com.abc.javacore.testando.classes;

public class Controle {

    public void controleUniversal(Funcionario acesso) {
        System.out.println("---------Relatorio de Pagamento");
        acesso.calculaSalario();
        System.out.println("Funcionario " + acesso.nome);
        System.out.println("Clt " + acesso.clt);
        System.out.println("Salario: " + acesso.salario);
        if (acesso instanceof Gerente) {
            Gerente g = (Gerente) acesso;
            System.out.println("Participação de Lucros: " + g.getPl());
        }
        if (acesso instanceof Vendedor){
            System.out.println("Total Vendas: " +((Vendedor) acesso).getTotalVendas() );
        }
    }
}
