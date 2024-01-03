package br.thalison.boardgame;

public class Posicao {

    private int linhas;
    private int coluna;

    public Posicao(int linhas, int coluna) {
        this.linhas = linhas;
        this.coluna = coluna;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    @Override
    public String toString() {
        return linhas + ", " + coluna;
    }
}
