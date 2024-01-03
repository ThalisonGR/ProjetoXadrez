package br.thalison.xadrez;

import br.thalison.boardgame.Tabuleiro;

public class PartidaXadrez {

    private Tabuleiro tabuleiro;

    public PartidaXadrez() {

        tabuleiro = new Tabuleiro(8,8);
    }

    //Retorna a matriz de peças da partida de Xadrez
    public  PecaXadrez [][] getPecas(){
        PecaXadrez [][] matriz = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i = 0; i < tabuleiro.getLinhas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
                matriz[i][j] = (PecaXadrez) tabuleiro.peca(i,j);
            }
        }
        return  matriz;
    }

}
