package academy.maratona.introducao.aula02;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 30;
        long numeroGrande = 1000000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Diego";

        System.out.println("A idade é " + idade + " anos ");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println(salarioFloat);
        System.out.println("Meu nome é "+ nome+ " e tenho " +idade+ " anos");
    }
}
