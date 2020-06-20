package br.com.abc.javacore.introducaometodos.classes;

public class Estudante {

    public String nome;
    public int idade;
    public double[] notas;


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
            System.out.println("Aprovado !!! Media " + media);
        } else {
            System.out.println("Reprovado !!! Media " + media);
        }
    }


}
