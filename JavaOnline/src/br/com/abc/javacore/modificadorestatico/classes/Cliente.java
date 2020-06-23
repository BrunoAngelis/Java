package br.com.abc.javacore.modificadorestatico.classes;

public class Cliente {


    private static int [] parcelas ;

    static {
        parcelas = new int [90];
        System.out.println("Dentro de inicializacao estacico");
        for (int i = 1; i <= 90; i++){
            parcelas [i-1] = i;
        }
    }

    public Cliente() {


    }

    public static int[] getParcelas() {
        return parcelas;
    }

    public static void setParcelas(int[] parcelas) {
        Cliente.parcelas = parcelas;
    }
}