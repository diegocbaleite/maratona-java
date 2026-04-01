package academy.maratona.javacore.Hheranca.test;

import academy.maratona.javacore.Hheranca.dominio.Endereco;
import academy.maratona.javacore.Hheranca.dominio.Funcionario;
import academy.maratona.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Jaciara,");
        endereco.setCep("78087-000");
        Pessoa pessoa = new Pessoa("Diego Assunção Leite");
        pessoa.setCpf("73055158172");
        pessoa.setEndereco(endereco);
        pessoa.imprime();


        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("123456789");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(50000);
        System.out.println("----------------");
        funcionario.imprime();
    }
}
