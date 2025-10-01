
package Audios.modelos;

public class AudioUtils {

    public static Musicas criarMusica(String titulo, String artista, String album, String genero, int reproducoes, int curtidas) {
        Musicas m = new Musicas();
        m.setTitulo(titulo);
        m.setArtista(artista);
        m.setAlbum(album);
        m.setGenero(genero);
        for (int i = 0; i < reproducoes; i++) m.reproduzir();
        for (int i = 0; i < curtidas; i++) m.curtir();
        return m;
    }

    public static Podcasts criarPodcast(String titulo, String apresentador, int reproducoes, int curtidas) {
        Podcasts p = new Podcasts();
        p.setTitulo(titulo);
        p.setApresentador(apresentador);
        for (int i = 0; i < reproducoes; i++) p.reproduzir();
        for (int i = 0; i < curtidas; i++) p.curtir();
        return p;
    }
}