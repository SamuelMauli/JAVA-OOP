package Exercicios.Ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Jogador> jogadores = new ArrayList<>();

        jogadores.add(new Jogador("Carlos", 1000, 3));
        jogadores.add(new Jogador("Ana", 800, 2));
        jogadores.add(new Jogador("Pedro", 1200, 4));

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Escalar jogador para Série C");
            System.out.println("2. Escalar jogador para Série B");
            System.out.println("3. Escalar jogador para Série A");
            System.out.println("4. Promover jogador para a Europa");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("5. Adicionar novo jogador");
            System.out.println("6. Remover jogador");
            System.out.println("7. Exibir informações de um jogador");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Jogador jogadorC = SelecionarJogador.selecionarJogador(jogadores);
                    EscalarSerie.escalarSerie(jogadorC, "Série C");
                    break;
                case 2:
                    Jogador jogadorB = SelecionarJogador.selecionarJogador(jogadores);
                    EscalarSerie.escalarSerie(jogadorB, "Série B");
                    break;
                case 3:
                    Jogador jogadorA = SelecionarJogador.selecionarJogador(jogadores);
                    EscalarSerie.escalarSerie(jogadorA, "Série A");
                    break;
                case 4:
                    Jogador jogadorEuropa = SelecionarJogador.selecionarJogador(jogadores);
                    PromoverEuropa.promoverEuropa(jogadorEuropa);
                    break;
                case 5:
                    adicionarJogador(jogadores, scanner);
                    break;
                case 6:
                    removerJogador(jogadores, scanner);
                    break;
                case 7:
                    exibirInformacoesJogador(jogadores, scanner);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void adicionarJogador(List<Jogador> jogadores, Scanner scanner) {
        System.out.print("Digite o nome do novo jogador: ");
        String nome = scanner.next();
        System.out.print("Digite a pontuação inicial do jogador: ");
        int pontuacao = scanner.nextInt();
        System.out.print("Digite o nível inicial do jogador: ");
        int nivel = scanner.nextInt();
        jogadores.add(new Jogador(nome, pontuacao, nivel));
        System.out.println("Novo jogador adicionado com sucesso!");
    }

    private static void removerJogador(List<Jogador> jogadores, Scanner scanner) {
        System.out.print("Digite o nome do jogador que deseja remover: ");
        String nome = scanner.next();
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getNome().equals(nome)) {
                jogadores.remove(i);
                System.out.println("Jogador removido com sucesso!");
                return;
            }
        }
        System.out.println("Jogador não encontrado.");
    }

    private static void exibirInformacoesJogador(List<Jogador> jogadores, Scanner scanner) {
        Jogador jogador = SelecionarJogador.selecionarJogador(jogadores);
        jogador.exibirInfo();
    }
}
