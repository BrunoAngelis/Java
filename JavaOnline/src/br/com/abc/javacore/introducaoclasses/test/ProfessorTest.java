package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        Professor prof2 = new Professor();

        prof.nome = "Bruno Garcia de Angelis";
        prof.matricula = "3016101406";
        prof.rg = "11.111.111-1";
        prof.cpf = "000.000.000.0";
        prof.exibirProfessor();
    }
}
