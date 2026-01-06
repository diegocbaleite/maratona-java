package academy.maratona.javacore.introducaoclasses.test;

import academy.maratona.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("Meu nome é " + professor.nome + ", idade: " + professor.idade + " anos, " + " sexo: " + professor.sexo);
    }
}
