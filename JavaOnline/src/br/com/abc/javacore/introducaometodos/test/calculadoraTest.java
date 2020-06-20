package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class calculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        System.out.println("--");
        calculadora.subtraiDoisNumeros();
        System.out.println("--");
        calculadora.multiplicaDoisNumeros(5,5);
        System.out.println("--");
        double vArmazena = calculadora.divideDoisNumeros(30,0);
        System.out.println(vArmazena);
        System.out.println("--");
        calculadora.imprimeDoisNumerosDivididos(10,2);


        calculadora.somaArray(1,2,3,4,5);
        }
}

