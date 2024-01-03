package br.thalison;

import br.thalison.xadrez.PecaXadrez;

public class UI {

    public static void apresentaTabuleiro(PecaXadrez[][] pecas) {

        for (int i = 0; i < pecas.length; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < pecas.length; j++) {
                apresentaPeca(pecas[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }


    //Imprimi uma peca
    private static void apresentaPeca(PecaXadrez peca) {
        if (peca == null) {
            System.out.print("- ");
        } else {
            System.out.print(" ");
        }
    }

}

