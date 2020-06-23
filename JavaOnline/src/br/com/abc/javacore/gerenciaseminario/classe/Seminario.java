package br.com.abc.javacore.gerenciaseminario.classe;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {

    }

    public void exibeSeminarios() {
        int qtdAlunos = 1;
        System.out.println("--------------Relatório de Seminarios-------------");
        System.out.println("Seminario: " + this.titulo);
        if (professor != null) {
            System.out.println("Professor:" + this.professor.getNome());
        } else {
            System.out.println("Nenhum Professor Cadastrado!");
        }
        if (local != null) {
            System.out.println("Local");
            System.out.println("Rua: " + this.local.getRua() + " Bairro: " + this.local.getBairro());
        } else {
            System.out.println("Local não foi definido");
        }
        if (alunos != null) {
            System.out.println("Alunos: ");
            for (Aluno al : alunos) {
                System.out.println(qtdAlunos+"-"+al.getNome());
                qtdAlunos++;
            }
        } else {
            System.out.println("Nunhum Aluno no seminario!");
        }
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
