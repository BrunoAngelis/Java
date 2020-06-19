package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Estudante;

public class EstudanTest {
    public static void main(String[] args) {

        Estudante aluno = new Estudante();

        aluno.nome = "Bruno Garcia de Angelis";
        aluno.matricula = "3016101406";
        aluno.idade = 23;

        aluno.exibirEstudante();

    }
}
