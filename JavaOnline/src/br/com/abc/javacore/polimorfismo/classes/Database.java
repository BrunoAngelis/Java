package br.com.abc.javacore.polimorfismo.classes;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Database implements  InterfaceDAO{


    @Override
    public void save() {
        System.out.println("Inserido no banco");
    }

}
