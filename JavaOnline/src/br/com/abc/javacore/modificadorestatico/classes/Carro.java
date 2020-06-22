package br.com.abc.javacore.modificadorestatico.classes;

public class Carro {
    // Velocidade Limite deve ser 240km/h

    private String modelo;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;

    public Carro(String modelo, double velocidadeMaxima){
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void exibeDados(){
        System.out.println("Carro: "+modelo);
        System.out.println("Velocidade Maxima: "+this.velocidadeMaxima);
        System.out.println("Velocidade Limite: "+velocidadeLimite);
        System.out.println("----------------------------");
    }

    public Carro(){

    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
       Carro.velocidadeLimite = velocidadeLimite;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }


}
