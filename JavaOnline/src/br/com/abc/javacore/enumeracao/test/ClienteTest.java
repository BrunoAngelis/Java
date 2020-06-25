package br.com.abc.javacore.enumeracao.test;

import br.com.abc.javacore.enumeracao.classes.Cliente;
import br.com.abc.javacore.enumeracao.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente("Bruno", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.AVISTA);
        System.out.println(c);
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());

    }
}
