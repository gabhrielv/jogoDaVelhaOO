    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogodavelhaoo;

/**
 *
 * @author Home
 */
public class tabuleiro {
    private char[][] posicoes;
    private int jogadas;
    
    
    
    public void getPosicoes() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(this.posicoes[i][j] + " ");
            }
            System.out.println(); // Mudança de linha após cada linha da matriz
        }
    }
    
    public tabuleiro() {
        this.posicoes = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.posicoes[i][j] = ' '; // Inicializa com espaço em branco
            }
        }
        this.jogadas = 0;
    }
    
    public void jogada(char simb, int col, int lin){
        if(this.posicoes[col][lin]== ' '){
            this.posicoes[col][lin]=simb;
            this.jogadas++;
        } else {
            System.out.println("Posição já está ocupada!");
        }
        this.verificaJogo();
    }

    private void verificaJogo() {
        for (int i = 0; i < 3; i++) {
            if(this.posicoes[i][0]==this.posicoes[i][1] && this.posicoes[i][2]==this.posicoes[i][1]){
                System.out.println("Fim de jogo!");
                i=10;
                return;
            }            
        }
        for (int i = 0; i < 3; i++) {
            if(this.posicoes[0][i]==this.posicoes[1][i] && this.posicoes[2][i]==this.posicoes[1][i]){
                System.out.println("Fim de jogo!");
                return;
            }            
        }
            if(this.posicoes[0][0]==this.posicoes[1][1] && this.posicoes[1][1]==this.posicoes[2][2]){
                System.out.println("Fim de jogo!");
                return;
            }    
            if(this.posicoes[0][2]==this.posicoes[1][1] && this.posicoes[1][1]==this.posicoes[2][0]){
                System.out.println("Fim de jogo!");
                return;
            }
        if(this.jogadas>=9){
                System.out.println("Empate!");
        }
    }
}

