package br.com.abc.javacore.testandopratica.classes;

public class Local {
    private String rua;
    private String bairro;

    public Local(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void exibeLocal() {
        System.out.println("============= Relatorio de Local =================");
        System.out.println("Rua: " + this.rua + " Bairro: " + this.bairro);
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
