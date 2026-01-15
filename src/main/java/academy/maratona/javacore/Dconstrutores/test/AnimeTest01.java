package academy.maratona.javacore.Dconstrutores.test;

import academy.maratona.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Boruto", "TV", 12, "Ação");
        Anime anime2 = new Anime();
        anime.imprimir();
        anime2.imprimir();
    }
}
