package br.thalison.boardgame;

public class Tabuleiro {

    private int linhas;
    private int colunas;
    private Peca [][] pecas;

    public Tabuleiro(int linhas, int colunas) {
        if (linhas < 1 || colunas <1){
            throw new TabuleiroException("Erro criando tabuleiro é necessário que tenha uma lunha e uma coluna");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];

    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    //Metodos da classe
    public  Peca peca (int linhas , int colunas){
        if (!posiscaoExiste(linhas , colunas)){
            throw new TabuleiroException("Posição não existe no tabuleiro");
        }
        return pecas[linhas][colunas];
    }
    public  Peca peca (Posicao posicao){
        if (!posicaoExiste(posicao)){
            throw new TabuleiroException("Posição não existe no tabuleiro");
        }
        return  pecas[posicao.getLinhas()][posicao.getColuna()];
    }

    public void  lugarPeca( Peca peca , Posicao posicao){
        if (temUmaPecaNaPosicao(posicao)){
            throw new TabuleiroException("Tem peça nessa posicao" + posicao);
        }
        pecas[posicao.getLinhas()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }

    //Verificação da linha
    private boolean posiscaoExiste(int linha , int coluna){
       return linha >= 0 && linha < linhas && coluna >=0 && coluna < colunas;
    }

    //Testa se a posição existe
    public boolean posicaoExiste(Posicao posicao){
        return  posiscaoExiste(posicao.getLinhas(), posicao.getColuna());
    }


    public boolean temUmaPecaNaPosicao(Posicao posicao){
        if (!posicaoExiste(posicao)){
            throw new TabuleiroException("Posicao não existe");
        }
        return peca(posicao) != null;
    }
}
