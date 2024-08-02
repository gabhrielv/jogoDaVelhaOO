/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jogodavelha;


import java.util.Scanner;
import java.util.*;

/**
 *
 * @author ice
 */
public class Jogodavelha{
    private static tabuleiro tab;
    public static void main(String[] args) {
        limpar();
        Scanner teclado = new Scanner(System.in);
        int opcao;
        tab = new tabuleiro();
        do {


            System.out.println("╔══════════════════════════╗");
            System.out.println("║      Jogo da velha       ║");
            System.out.println("╟──────────────────────────╢");
            System.out.println("║ 1. Iniciar Jogo          ║");
            System.out.println("║ 2. Instruções            ║");
            System.out.println("║ 3. Sair                  ║");
            System.out.println("╚══════════════════════════╝");


            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    modo();
                    break;
                case 2:
                    instrucao();
                case 3:
                    break;
                default:
                System.out.println("Opção inválida!");
            }
    } while (opcao != 3);

    teclado.close();

    }

    public static void jogadabot(){
        
    }
    
    public static void modo() {
        Scanner teclado = new Scanner(System.in);
        int x;
        limpar();
        System.out.println("╔══════════════════════════╗");
        System.out.println("║ 1. Contra jogador        ║");
        System.out.println("║ 2. Contra bot            ║");
        System.out.println("╚══════════════════════════╝");
        
        x = teclado.nextInt();

        switch(x){
            case 1: ladopvp();break;
            case 2: ladopve();break;
            default: System.out.println("Opção inválida!");
        }
        teclado.close();
    }


    public static void ladopvp() {
        limpar();
        Scanner teclado = new Scanner(System.in);
        char l;
        List<jogador> player = new ArrayList<>();
        for(int i = 1; i <= 2; i++){
            System.out.println("╔════════════════════════════╗");
            System.out.println("║          Jogador "+i+"         ║");
            System.out.println("║    Escolha entre X ou O    ║");
            System.out.println("╚════════════════════════════╝");
            l = teclado.next().charAt(0);
            limpar();
            if (l != 'X' && l != 'O') {
                System.out.println("Opção inválida!");
                i--;
                continue;
            }
            player.add(new jogador(l) );            
        }
        if(player.get(0).getSimbolo() == player.get(1).getSimbolo()){
            System.out.println("Letras Iguais!");
            ladopvp();
        }
        
        teclado.close();
    }

    
    public static void ladopve() {
        limpar();
        Scanner teclado = new Scanner(System.in);
        char l;
        System.out.println("╔════════════════════════════╗");
        System.out.println("║           Jogador          ║");
        System.out.println("║    Escolha entre X ou O    ║");
        System.out.println("╚════════════════════════════╝");
        l = teclado.next().charAt(0);
        limpar();
        if (l != 'X' && l != 'O') {
            System.out.println("Opção inválida!");
            ladopvp();
        }
        
        char botsimb = (l == 'X') ? 'O' : 'X';
        bot bot = new bot(botsimb);
        System.out.println("Você escolheu: " + l);
        System.out.println("O bot escolheu: " + bot.getSimb());
        jogo();
        teclado.close();
    }
    
    public static void jogo () {
        int x;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o local que deseja jogar:");
        x = teclado.nextInt();
        tab.imprimetab();
    }
    
    public static void instrucao() {
        limpar();
        Scanner teclado = new Scanner(System.in);
        int opt = 0;
        System.out.println("\nDois jogadores participam, cada um escolhendo ou \"X\" ou \"O\".\n");
        System.out.println("O objetivo é conseguir três \"X\" ou \"O\"em linha, essa linha pode ser horizontal, vertical ou diagonal.\n");
        System.out.println("Digite \"1\" quando desejar voltar");
        opt = teclado.nextInt();
        if (opt == 1)
        limpar();
        teclado.close();
        return;
    }


    public static void limpar(){
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); 
    }


    

}

