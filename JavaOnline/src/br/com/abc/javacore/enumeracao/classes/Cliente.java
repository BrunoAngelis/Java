package br.com.abc.javacore.enumeracao.classes;

public class Cliente {

    public enum TipoPagamento {
        AVISTA, APRAZO
    }

    private String nome;
    private TipoCliente tipo;
    private TipoPagamento tipoPagemaento;


    @Override
    public String toString() {
    return "Nome "+this.nome+"Tipo Cliente "+ this.tipo+" Tipo pagamento: "+this.tipoPagemaento+"Numero do Enum : "+tipo.getTipo();

    }

    public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipo = tipo;
        this.tipoPagemaento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }
}
