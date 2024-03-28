package Exercicios.Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Livro> biblioteca = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Exibir informações de um livro");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título do livro:");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o nome do autor:");
                    String autor = scanner.nextLine();
                    System.out.println("Digite o ano de publicação:");
                    int ano = scanner.nextInt();
                    biblioteca.add(new Livro(titulo, autor, ano));
                    System.out.println("Livro adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o número do livro:");
                    int numeroLivro = scanner.nextInt();
                    if (numeroLivro >= 0 && numeroLivro < biblioteca.size()) {
                        biblioteca.get(numeroLivro).exibirInfo();
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
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
