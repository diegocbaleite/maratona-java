package academy.maratona.introducao.aula05;

public class Aula05EstruturasCondicionais04 {
    // € 0       € 34,712      9.70%
    // € 34,713  € 68,507      37.35%
    // € 68,508  49.50%
    public static void main(String[] args) {
        double salarioAnual = 45000;
        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.50/100;
        double valorImposto;
        if (salarioAnual <= 34712){
            salarioAnual = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            salarioAnual = salarioAnual * segundaFaixa;
        }else {
            salarioAnual = salarioAnual * terceiraFaixa;
        }
        System.out.println(salarioAnual);
    }
}
