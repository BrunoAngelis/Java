package br.com.abc.javacore.sobrecargaconstrutores.test;

import br.com.abc.javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {

    public static void main(String[]args){
        Estudante estudante = new Estudante("301610106","Bruno Alfredo Toledo","22/06/2020",1,2,3);
        Estudante estudante2 = new Estudante("3016101404","Juliana Vitoria","22/06/2020",10,10,10);

        estudante.exibeDados();
        estudante2.exibeDados();

    }
}
