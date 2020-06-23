package br.com.abc.javacore.gerenciaseminario.classe;

public class Local {
    private String rua;
    private String bairro;

    public Local(String rua, String bairro){
        this.rua = rua;
        this.bairro = bairro;
    }

    public void exibeLocal(){
        System.out.println("--------------Relatório de local-------------");
        System.out.println("Rua: "+this.rua);
        System.out.println("Bairro: "+this.bairro);
    }

    public Local(){

    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }
}
