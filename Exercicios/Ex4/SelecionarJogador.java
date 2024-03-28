package Exercicios.Ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelecionarJogador {
    private static Scanner scanner = new Scanner(System.in);

    public static Jogador selecionarJogador(List<Jogador> jogadores) {
        System.out.println("Escolha um jogador:");
        for (int i = 0; i < jogadores.size(); i++) {
            System.out.println((i + 1) + ". " + jogadores.get(i).getNome());
        }
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        return jogadores.get(escolha - 1);
    }
}
