import java.util.Scanner;

class pvp {
    char letra;
    public pvp(char letra){
        this.letra= letra;
    }
    public char getLetra() {
        return letra;
    }
}

public class jogoDaVelhaOO {


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
            case 1: ladopvp();
            case 2: ladopve();
            default: System.out.println("Opção inválida!");
        }
        teclado.close();
    }


    public static void ladopvp() {
        limpar();
        final int max = 2;
        Scanner teclado = new Scanner(System.in);
        char l;
        pvp[] jogador = new pvp[max];
        for(int i = 1; i <= 2; i++){
            System.out.println("╔════════════════════════════╗");
            System.out.println("║          Jogador "+i+"         ║");
            System.out.println("║    Escolha entre X ou O    ║");
            System.out.println("╚════════════════════════════╝");
            l = teclado.next().charAt(0);
            if (l != 'X' && l != 'O') {
                System.out.println("Opção inválida!");
                ladopvp();
            }
            jogador[i].letra = l; // tem algum problema aqui, ainda nao olhei
            
        }
        if(jogador[1].letra == jogador[2].letra){
            System.out.println("Letras Iguais! Tente novamente, diferenciando as letras");
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
        if (l != 'X' && l != 'O') {
            System.out.println("Opção inválida!");
            ladopvp();
        }
        pvp jogador = new pvp(l);
        teclado.close();
    }


/*     public static void cj(){
        boolean fim = false;
        int y = 1;
        while(fim == false || y <= 9){

        }
    }*/


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


    public static void main(String[] args) {
        limpar();
        Scanner teclado = new Scanner(System.in);
        int opcao;

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

}