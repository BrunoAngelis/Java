package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String [] args){
        Estudante aluno1 = new Estudante();

        aluno1.nome = "Bruno Garcia de Angelis";
        aluno1.idade= 24;
        //aluno1.notas = new double [] {9,6,6,10};
        aluno1.exibirDados();
        aluno1.calcularMedia();


    }
}
