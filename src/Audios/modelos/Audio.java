package Audios.modelos;

public class Audio {
    private String titulo;
    private int totalCurtidas;
    private int totalReproducoes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    // Calcula dinamicamente a classificação nas subclasses
    public double getClassificacao() {
        return 0; // padrão, sobrescreva nas subclasses
    }

    public void curtir() {
        this.totalCurtidas++;
    }

    public void reproduzir() {
        this.totalReproducoes++;
    }
}
