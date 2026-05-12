package academy.maratona.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;
    static {
        System.out.println("Dentro do bloco inicialização estático de Funcionario ");
    }
    {
        System.out.println("Dentro do bloco inicialização estático de Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco inicialização estático de Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu: " + this.nome + " recebi o salário: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
