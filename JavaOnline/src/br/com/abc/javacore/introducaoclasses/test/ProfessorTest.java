package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor bruno = new Professor();

        bruno.nome = "Bruno Garcia de Angelis";
        bruno.matricula = "3016101406";
        bruno.rg = "11.111.111-1";
        bruno.cpf = "000.000.000.0";
        bruno.exibirProfessor();
    }
}
