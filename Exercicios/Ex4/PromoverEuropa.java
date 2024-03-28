package Exercicios.Ex4;

public class PromoverEuropa {
    public static void promoverEuropa(Jogador jogador) {
        if (jogador.getPontuacao() >= 1000) {
            System.out.println("Jogador " + jogador.getNome() + " promovido para jogar na Europa!");
        } else {
            System.out.println("Pontuação insuficiente para jogar na Europa.");
        }
    }
}
