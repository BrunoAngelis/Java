package br.com.abc.javacore.blocodeinicializacao.classes;

public class Cliente {


    private int [] parcelas ;

    {
        parcelas = new int [100];
        for (int i = 1; i <= 100; i++){
            parcelas [i-1] = i;
        }
    }

    public Cliente() {

        System.out.println("Dentro do construtor");
        for (int parcela : this.parcelas) {
            System.out.print(" " + parcela);

        }
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}