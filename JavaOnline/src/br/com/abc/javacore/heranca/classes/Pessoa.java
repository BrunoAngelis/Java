package br.com.abc.javacore.heranca.classes;

public class  Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public void exibeDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        if (endereco != null) {
            System.out.println("Endereço: " + " Rua: " + this.endereco.getRua() + " Bairro: " + this.endereco.getBairro());
            return;
        }
        System.out.println("Endereço não cadastrado!!!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
