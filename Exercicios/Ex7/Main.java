package Exercicios.Ex7;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> estoque = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Atualizar produto");
            System.out.println("3. Remover produto");
            System.out.println("4. Gerar relatório de estoque");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    adicionarProduto(estoque, scanner);
                    break;
                case 2:
                    atualizarProduto(estoque, scanner);
                    break;
                case 3:
                    removerProduto(estoque, scanner);
                    break;
                case 4:
                    gerarRelatorio(estoque);
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

    public static void adicionarProduto(List<Produto> estoque, Scanner scanner) {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Código do produto: ");
        int codigo = scanner.nextInt();
        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, codigo, preco, quantidade);
        estoque.add(produto);
        System.out.println("Produto adicionado com sucesso.");
    }

    public static void atualizarProduto(List<Produto> estoque, Scanner scanner) {
        System.out.print("Digite o código do produto a ser atualizado: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Produto produto = buscarProdutoPorCodigo(estoque, codigo);
        if (produto != null) {
            System.out.println("Produto encontrado. Digite as novas informações:");
            System.out.print("Nome do produto: ");
            produto.setNome(scanner.nextLine());
            System.out.print("Preço do produto: ");
            produto.setPreco(scanner.nextDouble());
            System.out.print("Quantidade em estoque: ");
            produto.setQuantidade(scanner.nextInt());
            System.out.println("Produto atualizado com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void removerProduto(List<Produto> estoque, Scanner scanner) {
        System.out.print("Digite o código do produto a ser removido: ");
        int codigo = scanner.nextInt();

        Produto produto = buscarProdutoPorCodigo(estoque, codigo);
        if (produto != null) {
            estoque.remove(produto);
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static Produto buscarProdutoPorCodigo(List<Produto> estoque, int codigo) {
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    public static void gerarRelatorio(List<Produto> estoque) {
        if (estoque.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            System.out.println("Relatório de estoque:");
            System.out.println("----------------------------------------------------");
            System.out.printf("%-20s | %-10s | %-10s | %-15s\n", "Nome", "Código", "Quantidade", "Valor Total");
            System.out.println("----------------------------------------------------");
            double valorTotal = 0;
            for (Produto produto : estoque) {
                double valorProduto = produto.getPreco() * produto.getQuantidade();
                valorTotal += valorProduto;
                System.out.printf("%-20s | %-10d | %-10d | %-15.2f\n", produto.getNome(), produto.getCodigo(), produto.getQuantidade(), valorProduto);
            }
            System.out.println("----------------------------------------------------");
            System.out.printf("Valor total em estoque: %.2f\n", valorTotal);
        }
    }
}
