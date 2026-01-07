package academy.maratona.javacore.Aintroducaoclasses.test;

import academy.maratona.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.nome = "Civic";
        carro1.modelo = "Honda";
        carro1.ano = 2020;

        Carro carro2 = new Carro();
        carro2.nome = "Corolla";
        carro2.modelo = "Toyota";
        carro2.ano = 2022;

        carro1 = carro2;

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("---------------");

        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}

