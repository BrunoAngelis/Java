package br.com.introducao.introducao.controlefluxo.arrays;

public class Arrays5 {
      public static void main(String[] args) {
          int [][] dias = new int [2][2];
          dias [0][0] = 1;
          dias [0][1] = 1;
          dias [1][0] = 2;
          dias [1][1] = 2;

          for(int i = 0; i < dias.length;i++){
              System.out.println(dias[i]);
              for(int j=0; j<dias[i].length;j++){
                  System.out.println(dias[i][j]);

              }
          }
          System.out.println("--");
          for (int [] aux : dias){
              for(int dia : aux){
                  System.out.println(dia);
              }
          }
      }
}
