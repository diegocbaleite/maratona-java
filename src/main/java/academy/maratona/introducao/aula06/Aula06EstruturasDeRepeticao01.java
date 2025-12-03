package academy.maratona.introducao.aula06;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(count++);
        }
        // do while
        count = 0;
        do {
            System.out.println("dentro do do-while " + ++count);
        } while (count < 10);
        // for
        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
