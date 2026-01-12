package academy.maratona.javacore.Bintroducaometodos.test;

import academy.maratona.javacore.Bintroducaometodos.dominio.Estudante;
import academy.maratona.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 12;
        estudante01.sexo = 'M';

        estudante02.nome= "Sakura";
        estudante02.idade = 10;
        estudante02.sexo = 'F';

        estudante01.imprimir();
        estudante02.imprimir();
    }
}
