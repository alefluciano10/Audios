package Audios.modelos;

public class Podcasts extends Audio{
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double getClassificacao() {
        if (super.getTotalCurtidas() > 1200) {
            return 10;
        } else {
            return 8;
        }
    }

    public void exibirPodcast() {
        System.out.println("\nTítulo       : " + getTitulo());
        System.out.println("Apresentador : " + getApresentador());
        System.out.println("Reproduções  : " + getTotalReproducoes());
        System.out.println("Curtidas     : " + getTotalCurtidas());
        System.out.println("Classificação: " + getClassificacao());
    }
}
