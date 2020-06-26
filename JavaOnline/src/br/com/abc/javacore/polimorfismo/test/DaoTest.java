package br.com.abc.javacore.polimorfismo.test;

import br.com.abc.javacore.polimorfismo.classes.Arquivo;
import br.com.abc.javacore.polimorfismo.classes.Database;
import br.com.abc.javacore.polimorfismo.classes.InterfaceDAO;

public class DaoTest {
    public static void main(String[] args) {
        InterfaceDAO a = new Arquivo();
        a.save();
    }
}
