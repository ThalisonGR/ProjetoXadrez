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


    private void iniciaPartida(){
        tabuleiro.lugarPeca(new Torre(tabuleiro , Cor.WHITE) , new Posicao(2,1) );
    }

}
