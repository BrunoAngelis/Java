package br.com.introducao.controlefluxo;

public class ExercicioControleDeFluxo {
    public static void main(String[] args) {
        double salario = 900;
        double totalImposto = 0;

        if (salario < 1000){
            totalImposto = salario * .05;
        }else if (salario >= 1000 && salario < 2000){
            totalImposto = salario * .10;
        }else if(salario >= 2000 && salario < 4000){
            totalImposto = salario * .15;
        }else{
            totalImposto = salario * .20;
        }
        System.out.println("O salario "+salario+" tem " +totalImposto+" descontado de impostos!");
    }
}
