package br.com.abc.javacore.sobrecargaconstrutores.classes;

public class Estudante {

    private String matricula;
    private String nome;
    private double [] notas;
    private String dataMatricula;

    public Estudante(String matricula, String nome,double...notas){
        this.matricula = matricula;
        this.nome =  nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome,String dataMatricula,double...notas){
        this(matricula,nome,notas);
        this.dataMatricula = dataMatricula;
    }

    public void exibeDados(){
        int numeroNotas = 1;
        System.out.println("Matricula: "+matricula);
        System.out.println("Data Matricula: "+dataMatricula);
        System.out.println("Nome: "+nome);
        if(this.notas == null){
            System.out.println("Não tem notas!");
            return;
        }
        for(double nota : this.notas){
            System.out.println("Nota "+numeroNotas+": "+nota);
            numeroNotas++;
        }

        System.out.println("\n");
    }


    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNotas (double [] notas){
        this.notas = notas;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public double [] getNotas(){
        return this.notas;
    }
}
