package academy.maratona.introducao.aula06;

public class Aula06EstruturasDeRepeticao05 {
    // Dado o valor de um carro, descubra quantas ele por ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorTtotal = 30000;
        for (int parcela = (int) valorTtotal; parcela >= 1; parcela--) {
            double valorParcela = valorTtotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }
    }
}
