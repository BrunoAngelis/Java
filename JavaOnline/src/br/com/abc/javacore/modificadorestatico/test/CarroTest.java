package br.com.abc.javacore.modificadorestatico.test;

import br.com.abc.javacore.modificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String [] args){

        Carro carro = new Carro("Palio",170);
        Carro carro2 = new Carro("Camaro",330);
        Carro carro3 = new Carro("F12",400);

        carro.exibeDados();
        carro2.exibeDados();
        carro3.exibeDados();

        System.out.println("#####################");

        Carro.setVelocidadeLimite(244);

        carro.exibeDados();
        carro2.exibeDados();
        carro3.exibeDados();


    }
}
