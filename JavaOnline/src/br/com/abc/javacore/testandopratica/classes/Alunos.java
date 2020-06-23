package br.com.abc.javacore.testandopratica.classes;

public class Alunos {

    private String nome;
    private int idade;
    private Seminario seminario;

    public Alunos(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibeAlunos() {

        System.out.println("============= Relatorio de Alunos =================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.seminario != null) {
            System.out.println("Seminarios Inscritos: ");
            System.out.println(this.seminario.getTitulo());
        }else{
            System.out.println("Nenhum seminaro inscrito!!");        }
    }

    public Alunos() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
