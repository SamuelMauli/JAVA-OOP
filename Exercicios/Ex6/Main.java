package Exercicios.Ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Buscar contato por nome");
            System.out.println("3. Remover contato");
            System.out.println("4. Exibir todos os contatos");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    adicionarContato(agenda, scanner);
                    break;
                case 2:
                    buscarContatoPorNome(agenda, scanner);
                    break;
                case 3:
                    removerContato(agenda, scanner);
                    break;
                case 4:
                    agenda.exibirTodosContatos();
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

    public static void adicionarContato(Agenda agenda, Scanner scanner) {
        System.out.print("Nome do contato: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone do contato: ");
        String telefone = scanner.nextLine();

        Contato contato = new Contato(nome, telefone);
        agenda.adicionarContato(contato);
    }

    private static void buscarContatoPorNome(Agenda agenda, Scanner scanner) {
        System.out.print("Digite o nome do contato a ser buscado: ");
        String nome = scanner.nextLine();
        agenda.buscarContatoPorNome(nome);
    }

    private static void removerContato(Agenda agenda, Scanner scanner) {
        System.out.print("Digite o nome do contato a ser removido: ");
        String nome = scanner.nextLine();
        agenda.removerContato(nome);
    }
}
