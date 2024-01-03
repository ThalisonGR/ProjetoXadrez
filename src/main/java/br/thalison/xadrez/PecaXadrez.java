package br.thalison.xadrez;

import br.thalison.boardgame.Peca;
import br.thalison.boardgame.Tabuleiro;

public class PecaXadrez  extends Peca {

    private  Cor cor;

    public PecaXadrez(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }


}
