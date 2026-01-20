package academy.maratona.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprimir() {
        System.out.println("----------------------");
        System.out.println("Marca do veículo: " + this.nome);
        System.out.println("Velocidade máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade limite: " + Carro.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
