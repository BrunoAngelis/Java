package br.com.abc.javacore.testandopratica.test;

import br.com.abc.javacore.testandopratica.classes.Alunos;
import br.com.abc.javacore.testandopratica.classes.Local;
import br.com.abc.javacore.testandopratica.classes.Professores;
import br.com.abc.javacore.testandopratica.classes.Seminario;

public class GerenciaTest {
    public static void main(String [] args){

        Seminario seminario = new Seminario ("Impostos e tributos");
        Alunos aluno = new Alunos("Juliana Vitoria da Silva",23);
        Professores professor = new Professores("Udemy","Curso - Tecnico");
        Local local = new Local ("Internet","Internet");

        //seminario.setAluno(new Alunos[]{aluno});
        //seminario.setLocal(local);
        //seminario.setProfessor(professor);

        //aluno.setSeminario(seminario);

        //professor.setSeminarios(new Seminario []{seminario});


        seminario.exibeSeminario();
        aluno.exibeAlunos();
        professor.exibeProfessor();
        local.exibeLocal();
    }
}
