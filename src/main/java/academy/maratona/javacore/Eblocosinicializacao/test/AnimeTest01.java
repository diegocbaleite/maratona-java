package academy.maratona.javacore.Eblocosinicializacao.test;

import academy.maratona.javacore.Eblocosinicializacao.domanin.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
