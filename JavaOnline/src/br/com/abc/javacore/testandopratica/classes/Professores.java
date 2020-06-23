package br.com.abc.javacore.testandopratica.classes;

public class Professores {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professores() {
    }

    public void exibeProfessor() {
        System.out.println("============= Relatorio de Professor =================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (this.seminarios != null && this.seminarios.length != 0) {
            System.out.println("Seminarios Cadastrados: ");
            for (Seminario sem : seminarios) {
                System.out.println(sem.getTitulo());
            }
            return;
        }
        System.out.println("Não esta cadastrado em seminarios");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
