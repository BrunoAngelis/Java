package br.com.abc.javacore.introducaometodos.classes;

public class Estudante {

    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;


    public void exibirDados() {
        int numeroNota = 1;
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (notas == null) {
            System.out.println("Aluno sem notas!");
            return;
        }
        for (double nota : notas) {
            System.out.print("Nota " + numeroNota + ": " + +nota + "\n");
            numeroNota++;
        }

    }

    public void calcularMedia() {
        if (notas == null) {
            System.out.println("Impossivel calcular media, por favor digite as notas!");
            return;
        }
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        media = media / notas.length;
        if (media >= 6) {
            this.aprovado = true;
            System.out.println("Aprovado !!! Media " + media);
        } else {
            this.aprovado = false;
            System.out.println("Reprovado !!! Media " + media);
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        if (idade < 0){
            System.out.println("Você não pode fazer isso!");
            return;
        }
        this.idade = idade;
    }

    public void setNotas (double[]notas){
        this.notas = notas;
    }

    public String  getNome (){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }

    public double [] getNotas(){
        return this.notas;
    }

    public boolean isAprovado(){
        return this.aprovado;
    }
}
