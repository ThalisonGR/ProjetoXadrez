package br.thalison.xadrez.pecas;

import br.thalison.boardgame.Tabuleiro;
import br.thalison.xadrez.Cor;
import br.thalison.xadrez.PecaXadrez;

public class Rei extends PecaXadrez {

    public Rei(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString() {
        return "R";
    }
}
