package Exercicios.Ex1;

public class Dividir {
    public static double calcular(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divisão por zero.");
        }
        return a / b;
    }
}
