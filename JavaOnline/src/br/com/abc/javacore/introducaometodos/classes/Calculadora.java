package br.com.abc.javacore.introducaometodos.classes;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println("5 + 5 = " + (5 + 5));
    }

    public void subtraiDoisNumeros() {
        System.out.println("5 - 2 = " + (5 - 2));
    }

    public void multiplicaDoisNumeros(int num1, int num2) {

        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("0");
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do altera dois Numeros");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }

    public void somaArray(int...numeros){
        int soma = 0;
        for(int aux : numeros){
            soma += aux;
        }
        System.out.println(soma);
    }
}
