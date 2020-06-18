package br.com.introducao;

public class Arrays2 {
    public static void main(String[] args) {
        String [] nomes = new String[ 5];

        nomes[0] = "Bruno";
        nomes[1] = "Barbara";
        nomes[2] = "Lucinei";
        nomes[3] = "Maju";
        nomes[4] = "Nivaldo";

        for(int i = 0; i< nomes.length ; i++){
            System.out.println(nomes[i]);
        }
    }
}
