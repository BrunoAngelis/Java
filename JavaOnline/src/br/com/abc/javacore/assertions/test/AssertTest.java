package br.com.abc.javacore.assertions.test;

public class AssertTest {
    public static void main(String[] args) {

        calculaSalario(-200);
    }

    private  static void calculaSalario(double salario) {
        assert (salario > 0):"O sálario não deve  ser menor que zero";
        System.out.println(salario);
    }

    public static void diasDasemana(int dia){
        switch (dia){
            case 1:break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            default: assert false;
        }
    }

}
