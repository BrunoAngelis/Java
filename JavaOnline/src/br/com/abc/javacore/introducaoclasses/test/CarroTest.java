package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro gol = new Carro();

        gol.modelo = "Gol";
        gol.fabricante = "VolksWagem";
        gol.velocidadeMaxima = 150;
        gol.placa = "ELD-7070";
        gol.exibirCarro();
        System.out.println("--");

        Carro palio = new Carro();

        palio.modelo = "Palio Economy 1.0";
        palio.fabricante = "Fiat";
        palio.velocidadeMaxima = 170;
        palio.placa = "xxx-1010";
        palio.exibirCarro();
        System.out.println("--");

    }

}
