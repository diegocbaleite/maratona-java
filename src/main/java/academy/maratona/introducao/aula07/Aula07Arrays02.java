package academy.maratona.introducao.aula07;

import java.util.Arrays;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float double 0
        // char '\u0000' ' ' '
        // boolean false
        // String null

        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kuririm";
        nomes[2] = "Buma";
        System.out.println(Arrays.toString(nomes));
    }
}
