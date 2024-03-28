package Exercicios.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        int escolha = scanner.nextInt();

        double resultado = 0;
        switch (escolha) {
            case 1:
                resultado = Somar.calcular(num1, num2);
                break;
            case 2:
                resultado = Subtrair.calcular(num1, num2);
                break;
            case 3:
                resultado = Multiplicar.calcular(num1, num2);
                break;
            case 4:
                try {
                    resultado = Dividir.calcular(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Escolha inválida. Tente novamente.");
                return;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
