package br.inatel.cdg.classes;

public class Fetin {
    private String titulo;
    private double pontuacao;

    public Fetin(String titulo, double pontuacao){
        this.titulo = titulo;
        this.pontuacao = pontuacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPontuacao() {
        return pontuacao;
    }
}
