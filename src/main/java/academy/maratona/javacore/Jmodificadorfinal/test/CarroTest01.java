package academy.maratona.javacore.Jmodificadorfinal.test;

import academy.maratona.javacore.Jmodificadorfinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();


        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Diego");
        System.out.println(carro.COMPRADOR);
    }
}
