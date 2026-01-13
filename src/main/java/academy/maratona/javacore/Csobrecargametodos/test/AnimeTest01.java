package academy.maratona.javacore.Csobrecargametodos.test;

import academy.maratona.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 12);
        anime.init("Naruto", "TV", 12, "Ação");
        anime.setGenero("Ação");
        anime.imprimir();
    }
}
