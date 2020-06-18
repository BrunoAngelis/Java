package br.com.introducao;

public class Arrays3 {
    public static void main(String[] args) {

        int[] number = {1,2,3,4,5};
        String[] names = {"Bruno","Barbara","Maju"};

        for(int aux : number){
            System.out.println(aux);
        }

        for (String aux : names){
            System.out.println(aux);
        }
    }
}
