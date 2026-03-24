package academy.maratona.javacore.Gassociacao.test;

import academy.maratona.javacore.Gassociacao.dominio.Aluno;
import academy.maratona.javacore.Gassociacao.dominio.Local;
import academy.maratona.javacore.Gassociacao.dominio.Professor;
import academy.maratona.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy",30);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
