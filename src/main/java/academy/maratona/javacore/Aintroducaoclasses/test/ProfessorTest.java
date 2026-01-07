package academy.maratona.javacore.Aintroducaoclasses.test;

import academy.maratona.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("Meu nome é " + professor.nome + ", idade: " + professor.idade + " anos, " + " sexo: " + professor.sexo);
    }
}
