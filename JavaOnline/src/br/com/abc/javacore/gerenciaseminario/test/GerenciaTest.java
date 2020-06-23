package br.com.abc.javacore.gerenciaseminario.test;

import br.com.abc.javacore.gerenciaseminario.classe.Aluno;
import br.com.abc.javacore.gerenciaseminario.classe.Local;
import br.com.abc.javacore.gerenciaseminario.classe.Professor;
import br.com.abc.javacore.gerenciaseminario.classe.Seminario;

public class GerenciaTest {
    public static void main(String [] args){


        Seminario seminario = new Seminario("Cora coralina");
        Seminario seminario2 = new Seminario("Jura Jura");
        Aluno aluno = new Aluno("Bruno",23);
        Aluno aluno2 = new Aluno("Joana",35);
        Professor professor = new Professor("Jetulio","Matematico");
        Local local = new Local("Rua Das Uvas","Campo");

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        seminario.setAlunos(new Aluno[] {aluno,aluno2});
        seminario.setProfessor(professor);
        seminario.setLocal(local);

        professor.setSeminarios(new Seminario []{seminario,seminario2});

        aluno.exibeAluno();
        professor.exibeProfessor();
        seminario.exibeSeminarios();

    }
}
