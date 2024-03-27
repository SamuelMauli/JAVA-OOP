import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        executarCalculadora();
    }

    public static void executarCalculadora() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha a operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    adicao();
                    break;
                case 2:
                    subtracao();
                    break;
                case 3:
                    multiplicacao();
                    break;
                case 4:
                    divisao();
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Calculadora encerrada.");
                    Main.main(null);
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    public static void adicao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();
        double resultado = num1 + num2;
        System.out.println("Resultado: " + resultado);
    }

    public static void subtracao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();
        double resultado = num1 - num2;
        System.out.println("Resultado: " + resultado);
    }

    public static void multiplicacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();
        double resultado = num1 * num2;
        System.out.println("Resultado: " + resultado);
    }

    public static void divisao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();
        
        if (num2 != 0) {
            double resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Erro: Divisão por zero.");
        }
    }
}
