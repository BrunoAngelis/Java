package br.com.abc.javacore.gerenciaseminario.classe;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;


    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;

    }

    public void exibeProfessor() {
        int qtdSemi = 1;
        System.out.println("--------------Relatório de Professor-------------");
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Seminarios Participantes: ");
        if (this.seminarios != null) {
            for (Seminario semi : seminarios) {
                System.out.println(qtdSemi + "-" + semi.getTitulo());
                qtdSemi++;
            }
        }else{
            System.out.println("Não esta cadastrado em seminarios!!!");
        }
    }

    public Professor() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
