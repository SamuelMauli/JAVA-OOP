package Geral;
import java.util.Scanner;

public class GerenciamentoJogadores {
    public static void executarGerenciamentoJogadores() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema de Gerenciamento de Jogadores!");

        // Criando um jogador inicial
        Jogador jogador1 = new Jogador("Player1", 0, 1);

        int opcao;
        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Aumentar Pontuação");
            System.out.println("2. Subir de Nível");
            System.out.println("3. Exibir Informações do Jogador");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a quantidade de pontos a serem adicionados: ");
                    int pontos = scanner.nextInt();
                    jogador1.aumentarPontuacao(pontos);
                    break;
                case 2:
                    jogador1.subirNivel();
                    break;
                case 3:
                    jogador1.exibirInformacoes();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    Main.main(null);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void main(String[] args) {
        executarGerenciamentoJogadores();
    }
}
