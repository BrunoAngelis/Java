package br.com.abc.javacore.introducaoclasses.classes;

public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void exibirProfessor(){
        System.out.println("Professor Cadastrado:");
        System.out.println("Nome "+nome);
        System.out.println("Matricula "+matricula);
        System.out.println("RG "+rg);
        System.out.println("CPF "+cpf);
    }


}
