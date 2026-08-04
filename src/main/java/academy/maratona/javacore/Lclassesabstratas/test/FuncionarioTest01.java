package academy.maratona.javacore.Lclassesabstratas.test;

import academy.maratona.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.maratona.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.maratona.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Toya", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
