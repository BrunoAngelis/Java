package br.com.abc.javacore.exception.runtimeexception.test;

public class RunTimeExceptionTest {
    public static void main(String[] args) {
        divisao(10, 0);

    }

    private static void divisao(int num1, int num2) {
        if (num1 == 0 ||   num2 == 0) {
            throw new IllegalArgumentException("Digite um valor diferente de 0");
        }
        double resultado = num1 / num2;
        System.out.println(resultado);

    }
}
