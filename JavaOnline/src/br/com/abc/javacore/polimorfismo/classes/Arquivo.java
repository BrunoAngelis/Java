package br.com.abc.javacore.polimorfismo.classes;

public class Arquivo implements InterfaceDAO {
    @Override
    public void save() {
        System.out.println("Inserido no arquivo");
    }
}
