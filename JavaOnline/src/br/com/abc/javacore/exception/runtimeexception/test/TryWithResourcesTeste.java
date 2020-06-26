package br.com.abc.javacore.exception.runtimeexception.test;

import br.com.abc.javacore.exception.runtimeexception.classes.Leitor1;
import br.com.abc.javacore.exception.runtimeexception.classes.Leitor2;

import java.io.*;

public class TryWithResourcesTeste {
    public static void main(String[] args) {

        lerArquivo();
    }

    public static void lerArquivo(){
        try (Leitor1 v = new Leitor1();
             Leitor2 a = new Leitor2())
             {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
