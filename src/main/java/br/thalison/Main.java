package br.thalison;

import br.thalison.xadrez.PartidaXadrez;

public class Main {
    public static void main(String[] args) {

        PartidaXadrez partidaXadrez = new PartidaXadrez();

        UI.apresentaTabuleiro(partidaXadrez.getPecas());



    }
}