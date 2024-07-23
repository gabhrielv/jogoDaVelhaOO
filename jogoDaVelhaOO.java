import java.util.Scanner;

public class jogoDaVelhaOO {
    public static int jogo() {
        return 0;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {


            System.out.println("╔══════════════════════════╗");
            System.out.println("╢      Jogo da velha       ╢");
            System.out.println("╟──────────────────────────╢");
            System.out.println("║ 1. Iniciar Jogo          ║");
            System.out.println("║ 2. Instruções            ║");
            System.out.println("║ 3. Sair                  ║");
            System.out.println("╚══════════════════════════╝");


            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    jogo();
                    break;
                case 2:
                    System.out.println("\nDois jogadores participam, cada um escolhendo ou \"X\" ou \"O\".\n");
                    System.out.println("O objetivo é conseguir três \"X\" ou \"O\"em linha, essa linha pode ser horizontal, vertical ou diagonal.\n");
                default:
                    System.out.println("Opção inválida!");
            }
    } while (opcao != 3);

    teclado.close();

    }

}