package Exercicios.Ex5;

public class Velocidade {
    public static void acelerar(int velocidadeAtual) {
        velocidadeAtual += 10;
        System.out.println("Carro acelerado. Velocidade atual: " + velocidadeAtual);
    }

    public static void frear(int velocidadeAtual) {
        velocidadeAtual -= 10;
        System.out.println("Carro freado. Velocidade atual: " + velocidadeAtual);
    }
}
