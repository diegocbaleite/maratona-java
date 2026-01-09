package academy.maratona.javacore.Bintroducaometodos.test;

import academy.maratona.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
       double resultado = calculadora.divideDoisNumeros(20, 0);
        System.out.println(resultado);
    }
}
