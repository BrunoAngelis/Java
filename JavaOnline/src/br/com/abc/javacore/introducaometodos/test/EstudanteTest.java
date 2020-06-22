package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String [] args){
        Estudante aluno1 = new Estudante();

        aluno1.setNome("Bruno Garcia de Angelis");
        aluno1.setIdade(-1);
        aluno1.setNotas(new double[]{3,4,5,});
        aluno1.exibirDados();
        aluno1.calcularMedia();
        System.out.println(aluno1.getNome());
        System.out.println("Aprovado? " + aluno1.isAprovado());
    }
}
