package Exercicios.Ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro carro = new Carro("Toyota", "Corolla", 2022, "ABC-1234", 0);

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Acelerar o carro");
            System.out.println("2. Frear o carro");
            System.out.println("3. Exibir informações do carro");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    carro.acelerar();
                    break;
                case 2:
                    carro.frear();
                    break;
                case 3:
                    carro.exibirInfo();
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
}
