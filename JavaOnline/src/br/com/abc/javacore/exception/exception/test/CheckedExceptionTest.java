package br.com.abc.javacore.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args)  {

        abrirArquivo();
    }

    public static void criarArquivo() throws IOException {
        File file = new File("Tesste.txt");
        try {
            System.out.println("Arquivo criado ? : " + file.createNewFile());
            file.createNewFile();
            System.out.println("Arquivo Criado!!");

        } catch (IOException v) {
            v.printStackTrace();
            throw v;
        }
    }

    public static void abrirArquivo(){
        File file = new File("Tesste.txt");
        try {
            System.out.println("Abrindo um aqrquivo");
            System.out.println("Executando leitura");
            //throw new Exception();
            System.out.println("Excrevendo no arquivo!!");

        } catch (Exception v) {
            System.out.println("Dentro do catch");
            v.printStackTrace();
        }finally{
            System.out.println("Fechando arquivo ");
        }
    }
}
