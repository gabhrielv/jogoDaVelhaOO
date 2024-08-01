    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogodavelha;
import java.util.*;
/**
 *
 * @author Home
 */
public class tabuleiro {
    private char[][] posicoes;
    private int jogadas;

    public char[][] getPosicoes() {
        char[][] copia = new char[3][3];
        for (int i = 0; i < 3; i++) {
            System.arraycopy(posicoes[i], 0, copia[i], 0, 3);
        }
        return copia;
    }
    
    

    public void fazerJogada(char simbolo, int coluna, int linha) {
        if (coluna >= 0 && coluna < 3 && linha >= 0 && linha < 3 && this.posicoes[coluna][linha] == ' ') {
            this.posicoes[coluna][linha] = simbolo;
            this.jogadas++;
        } else {
            System.out.println("Posição inválida!");
        }
    }



    
    public tabuleiro() {
        posicoes = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                posicoes[i][j] = ' ';
            }
        }
    }
    
    public void imprimetab(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(posicoes[i][j]);
                if(j < 3 - 1) {
                    System.out.println("|");
                }
                System.out.println();
                if(i < 3 - 1) {
                    System.out.println("--------");
                }
            }
        }
    }
    

    public void jogada(char simb, int col, int lin) {
        if (col >= 0 && col < 3 && lin >= 0 && lin < 3 && this.posicoes[col][lin] == ' ') {
            this.posicoes[col][lin] = simb;
            this.jogadas++;
            verificaJogo();
        } else {
            System.out.println("Posição inválida!");
        }
    }

    
    
    public void verificaJogo() {
        //horizontal
        for (int i = 0; i < 3; i++) {
            if (this.posicoes[i][0] == this.posicoes[i][1] && this.posicoes[i][1] == this.posicoes[i][2] && this.posicoes[i][0] != ' ') {
                System.out.println("Fim de jogo! Vencedor: " + this.posicoes[i][0]);
                return;
            }
        }

        //vertical
        for (int i = 0; i < 3; i++) {
            if (this.posicoes[0][i] == this.posicoes[1][i] && this.posicoes[1][i] == this.posicoes[2][i] && this.posicoes[0][i] != ' ') {
                System.out.println("Fim de jogo! Vencedor: " + this.posicoes[0][i]);
                return;
            }
        }

        //diagonal
        if (this.posicoes[0][0] == this.posicoes[1][1] && this.posicoes[1][1] == this.posicoes[2][2] && this.posicoes[0][0] != ' ') {
            System.out.println("Fim de jogo! Vencedor: " + this.posicoes[0][0]);
            return;
        }

        if (this.posicoes[0][2] == this.posicoes[1][1] && this.posicoes[1][1] == this.posicoes[2][0] && this.posicoes[0][2] != ' ') {
            System.out.println("Fim de jogo! Vencedor: " + this.posicoes[0][2]);
            return;
        }

        //empate
        if (this.jogadas >= 9) {
            System.out.println("Empate!");
        }
    }
}