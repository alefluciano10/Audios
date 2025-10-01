package Audios.modelos;

public class Musicas extends Audio {
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public double getClassificacao() {
        if (super.getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }

    public void exibirMusica() {
        System.out.println("\nTítulo       : " + getTitulo());
        System.out.println("Artista      : " + getArtista());
        System.out.println("Álbum        : " + getAlbum());
        System.out.println("Gênero       : " + getGenero());
        System.out.println("Reproduções  : " + getTotalReproducoes());
        System.out.println("Curtidas     : " + getTotalCurtidas());
        System.out.println("Classificação: " + getClassificacao());
    }
}
