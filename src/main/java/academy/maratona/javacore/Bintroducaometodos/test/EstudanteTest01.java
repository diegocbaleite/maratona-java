package academy.maratona.javacore.Bintroducaometodos.test;

import academy.maratona.javacore.Bintroducaometodos.dominio.Estudante;
import academy.maratona.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante  impressora = new ImpressoraEstudante();

        estudante01.nome = "Naruto";
        estudante01.idade = 12;
        estudante01.sexo = 'M';

        estudante02.nome= "Sakura";
        estudante02.idade = 10;
        estudante02.sexo = 'F';

        impressora.imprimir(estudante01);

        impressora.imprimir(estudante02);

        System.out.println("############");
        impressora.imprimir(estudante01);
        impressora.imprimir(estudante02);

    }
}
