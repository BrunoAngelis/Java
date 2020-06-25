package br.com.abc.javacore.enumeracao.classes;

public enum TipoCliente {
    PESSOA_FISICA(4) {
        public String getId() {
            return "B";
        }
    }, PESSOA_JURIDICA(2);

    private int tipo;

    TipoCliente(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public String getId() {
        return "A";
    }
}
