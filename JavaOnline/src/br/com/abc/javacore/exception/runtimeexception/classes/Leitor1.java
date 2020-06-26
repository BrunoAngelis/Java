package br.com.abc.javacore.exception.runtimeexception.classes;

public class Leitor1 implements AutoCloseable{


    @Override
    public void close() throws Exception {
        System.out.println("Fechando Leitor 2");
    }
}
