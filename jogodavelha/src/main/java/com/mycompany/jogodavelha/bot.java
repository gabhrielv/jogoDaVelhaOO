package com.mycompany.jogodavelha;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabhr
 */
public class bot {
    private char simb;
    private tabuleiro x;
    
    
    public bot(char simb){
        this.simb = simb;
        this.x = x;
    }

    public char getSimb() {
        return simb;
    }
    
    public int minimax(int depth, boolean isMax) {
        x.verificaJogo();
        return 0;
    }
    
 public int minimax(tabuleiro t, int profundidade, boolean maximizando) {
        if (maximizando) {
            int melhorPontuacao = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (t.getPosicoes()[i][j] == ' ') {
                        t.fazerJogada(simb, i, j);
                        int pontuacao = minimax(t, profundidade + 1, false);
                        t.getPosicoes()[i][j] = ' ';
                        melhorPontuacao = Math.max(pontuacao, melhorPontuacao);
                    }
                }
            }
            return melhorPontuacao;
        } else {
            int melhorPontuacao = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (t.getPosicoes()[i][j] == ' ') {
                        t.fazerJogada(simb == 'X' ? 'O' : 'X', i, j);
                        int pontuacao = minimax(t, profundidade + 1, true);
                        t.getPosicoes()[i][j] = ' ';
                        melhorPontuacao = Math.min(pontuacao, melhorPontuacao);
                    }
                }
            }
            return melhorPontuacao;
        }
    }

    public void encontrarMelhorJogada() {
        int melhorLinha = -1;
        int melhorColuna = -1;
        int melhorPontuacao = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro.getPosicoes()[i][j] == ' ') {
                    tabuleiro.fazerJogada(simb, i, j);
                    int pontuacaoMovimento = minimax(tabuleiro, 0, false);
                    tabuleiro.getPosicoes()[i][j] = ' ';
                    if (pontuacaoMovimento > melhorPontuacao) {
                        melhorPontuacao = pontuacaoMovimento;
                        melhorLinha = i;
                        melhorColuna = j;
                    }
                }
            }
        }

        if (melhorLinha != -1 && melhorColuna != -1) {
            tabuleiro.fazerJogada(simb, melhorLinha, melhorColuna);
            System.out.println("Melhor movimento para " + simb + ": (" + melhorLinha + ", " + melhorColuna + ")");
        }
    }
}
