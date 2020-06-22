package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class calculadoraTest {
    public static void main(String[] args) {

        Calculadora.somaDoisNumeros();
        System.out.println("--");
        Calculadora.subtraiDoisNumeros();
        System.out.println("--");
        Calculadora.multiplicaDoisNumeros(5,5);
        System.out.println("--");
        double vArmazena = Calculadora.divideDoisNumeros(30,0);
        System.out.println(vArmazena);
        System.out.println("--");
        Calculadora.imprimeDoisNumerosDivididos(10,2);


        Calculadora.somaArray(1,2,3,4,5);
        }
}

