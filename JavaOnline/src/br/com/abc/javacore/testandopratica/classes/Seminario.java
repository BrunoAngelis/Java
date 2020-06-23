package br.com.abc.javacore.testandopratica.classes;

public class Seminario {
    private String titulo;
    private Alunos[] aluno;
    private Professores professor;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    public void exibeSeminario() {
        int nAlunos = 1;
        System.out.println("============= Relatorio de Seminario =================");
        System.out.println("Titulo: " + this.titulo);
        if (this.professor != null) {
            System.out.println("Professor cadastrado: " + this.professor.getNome());
        } else {
            System.out.println("Nenhum professor cadastrado!");
        }

        if (this.local != null) {
            System.out.println("Local: " + "Rua " + this.local.getRua() + " Bairro: " + this.local.getBairro());
        } else {
            System.out.println("Nenhum endereço cadastrado!");
        }
        if (this.aluno != null && this.aluno.length != 0) {
            System.out.println("Alunos Cadastrados: ");
            for (Alunos aluno : this.aluno) {
                System.out.println(nAlunos + "-" + aluno.getNome());
            }
            return;
        }
        System.out.println("Nenhum aluno Cadastrado!");
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Alunos[] getAluno() {
        return aluno;
    }

    public void setAluno(Alunos[] aluno) {
        this.aluno = aluno;
    }

    public Professores getProfessor() {
        return professor;
    }

    public void setProfessor(Professores professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
