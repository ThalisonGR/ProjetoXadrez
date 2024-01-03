package br.thalison.xadrez;

import br.thalison.boardgame.Posicao;
import br.thalison.boardgame.Tabuleiro;
import br.thalison.xadrez.pecas.Rei;
import br.thalison.xadrez.pecas.Torre;

import java.awt.*;

public class PartidaXadrez {

    private Tabuleiro tabuleiro;

    public PartidaXadrez() {

        tabuleiro = new Tabuleiro(8,8);
        iniciaPartida();
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

    private void lugarNovoPeca(char colum , int linha , PecaXadrez peca){
        tabuleiro.lugarPeca(peca , new XadrezPosicao(colum,linha).posicionar());
    }
    private void iniciaPartida(){
        lugarNovoPeca('c', 1, new Torre(tabuleiro, Cor.WHITE));
        lugarNovoPeca('c', 2, new Torre(tabuleiro, Cor.WHITE));
        lugarNovoPeca('d', 2, new Torre(tabuleiro, Cor.WHITE));
        lugarNovoPeca('e', 2, new Torre(tabuleiro, Cor.WHITE));
        lugarNovoPeca('e', 1, new Torre(tabuleiro, Cor.WHITE));
        lugarNovoPeca('d', 1, new Rei(tabuleiro, Cor.WHITE));

        lugarNovoPeca('c', 7, new Torre(tabuleiro, Cor.BLACK));
        lugarNovoPeca('c', 8, new Torre(tabuleiro, Cor.BLACK));
        lugarNovoPeca('d', 7, new Torre(tabuleiro, Cor.BLACK));
        lugarNovoPeca('e', 7, new Torre(tabuleiro, Cor.BLACK));
        lugarNovoPeca('e', 8, new Torre(tabuleiro, Cor.BLACK));
        lugarNovoPeca('d', 8, new Rei(tabuleiro, Cor.BLACK));
    }

}
