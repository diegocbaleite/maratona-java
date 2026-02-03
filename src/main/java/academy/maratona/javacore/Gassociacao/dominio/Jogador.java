package academy.maratona.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
