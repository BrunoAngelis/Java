package br.com.introducao;

public class ControleFluxo4 {
    public static void main(String[] args) {
        int cont = 1;

        while(cont <= 10){
            System.out.println(cont);
            cont++;
        }

        do{
            System.out.println("Dentro do while");
        }while (cont<10);

        for(int i = 0; i < 10; i++){
            System.out.println("Valor de i é: "+i);
        }
    }
}
