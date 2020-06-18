package br.com.introducao.arrays;

public class Arrays6 {
    public static void main(String[] args) {

        int [][] dias = new int[3][];
        dias[0] = new int[2];
        dias[1] = new int []{1,2,3};
        dias[2] = new int [4];

        for(int[] aux: dias){
            for(int num : aux){
                System.out.println(num);
            }
        }
    }
}
