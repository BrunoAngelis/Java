package br.com.abc.javacore.exception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplasRunTimeTest {
    public static void main(String[] args) {


        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException ");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException ");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException ");
        }

        System.out.println("Saiu aqui e continua");

        try {
            talvezLanceException();
        } catch (Exception e) {

        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
