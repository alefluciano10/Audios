package Audios.principal;

import Audios.modelos.Musicas;
import Audios.modelos.Podcasts;
import Audios.modelos.AudioUtils;

public class Principal {

    public static void main(String[] args) {

        // ---------- Criar Músicas ----------
        Musicas musica1 = AudioUtils.criarMusica("Forever", "Kiss", "Forever Album", "Rock", 1000, 50);
        Musicas musica2 = AudioUtils.criarMusica("Imagine", "John Lennon", "Imagine Album", "Pop", 2500, 300);
        Musicas musica3 = AudioUtils.criarMusica("Bohemian Rhapsody", "Queen", "A Night at the Opera", "Rock", 5000, 500);

        // ---------- Criar Podcasts ----------
        Podcasts p1 = AudioUtils.criarPodcast("BolhaDev", "Marcos Mendes", 3000, 1000);
        Podcasts p2 = AudioUtils.criarPodcast("TechTalks", "Ana Souza", 1500, 800);
        Podcasts p3 = AudioUtils.criarPodcast("History Hour", "Carlos Lima", 2000, 600);

        // ---------- Exibir Músicas ----------
        System.out.println("\n" + "=".repeat(50));
        System.out.println("                  🎵 MÚSICAS");
        System.out.println("=".repeat(50));
        musica1.exibirMusica();
        musica2.exibirMusica();
        musica3.exibirMusica();

        // ---------- Exibir Podcasts ----------
        System.out.println("\n" + "=".repeat(50));
        System.out.println("                 🎙️ PODCASTS");
        System.out.println("=".repeat(50));
        p1.exibirPodcast();
        p2.exibirPodcast();
        p3.exibirPodcast();

        System.out.println("\n" + "=".repeat(50));
    }
}
