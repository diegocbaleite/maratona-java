package academy.maratona.javacore.Fmodificadorestatico.test;

import academy.maratona.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 279);

        Carro.velocidadeLimite = 180;

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
    }
}
