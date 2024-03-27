import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalMercado {
    public static void main(String[] args) {
        executarMercado();
    }

    public static void executarMercado() {
        List<Produto> estoque = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Atualizar produto");
            System.out.println("3. Remover produto");
            System.out.println("4. Verificar estoque");
            System.out.println("5. Fazer venda");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer do scanner

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
                    verificarEstoque(estoque);
                    break;
                case 5:
                    fazerVenda(estoque, scanner);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    Main.main(null);
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
        String codigo = scanner.nextLine();
        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidade = scanner.nextInt();
        estoque.add(new Produto(nome, codigo, preco, quantidade));
        System.out.println("Produto adicionado com sucesso.");
    }

    public static void atualizarProduto(List<Produto> estoque, Scanner scanner) {
        System.out.print("Digite o código do produto a ser atualizado: ");
        String codigoAtualizar = scanner.nextLine();
        for (Produto produto : estoque) {
            if (produto.getCodigo().equals(codigoAtualizar)) {
                System.out.print("Novo nome: ");
                String novoNome = scanner.nextLine();
                System.out.print("Novo preço: ");
                double novoPreco = scanner.nextDouble();
                System.out.print("Nova quantidade em estoque: ");
                int novaQuantidade = scanner.nextInt();
                produto.setNome(novoNome);
                produto.setPreco(novoPreco);
                produto.setQuantidade(novaQuantidade);
                System.out.println("Produto atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public static void removerProduto(List<Produto> estoque, Scanner scanner) {
        System.out.print("Digite o código do produto a ser removido: ");
        String codigoRemover = scanner.nextLine();
        for (Produto produto : estoque) {
            if (produto.getCodigo().equals(codigoRemover)) {
                estoque.remove(produto);
                System.out.println("Produto removido com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public static void verificarEstoque(List<Produto> estoque) {
        System.out.println("\nEstoque atual:");
        for (Produto produto : estoque) {
            System.out.println("Nome: " + produto.getNome() + ", Código: " + produto.getCodigo() +
                    ", Preço: " + produto.getPreco() + ", Quantidade em estoque: " + produto.getQuantidade());
        }
    }

    public static void fazerVenda(List<Produto> estoque, Scanner scanner) {
        Venda venda = new Venda();
        double totalVenda = 0;

        while (true) {
            System.out.print("Digite o código do produto (0 para sair): ");
            String codigo = scanner.nextLine();
            if (codigo.equals("0")) {
                break;
            }

            Produto produtoVenda = null;
            for (Produto produto : estoque) {
                if (produto.getCodigo().equals(codigo)) {
                    produtoVenda = produto;
                    break;
                }
            }

            if (produtoVenda == null) {
                System.out.println("Produto não encontrado no estoque.");
                continue;
            }

            System.out.print("Quantidade desejada: ");
            int quantidadeDesejada = scanner.nextInt();

            if (quantidadeDesejada > produtoVenda.getQuantidade()) {
                System.out.println("Quantidade indisponível no estoque.");
                continue;
            }

            venda.adicionarItem(produtoVenda);
            totalVenda += produtoVenda.getPreco() * quantidadeDesejada;
            produtoVenda.setQuantidade(produtoVenda.getQuantidade() - quantidadeDesejada);
            System.out.println("Produto adicionado à venda.");
        }

        System.out.println("\nResumo da Venda:");
        for (Produto produto : venda.getItensVenda()) {
            System.out.println("Nome: " + produto.getNome() + ", Preço unitário: " + produto.getPreco());
        }
        System.out.println("Total da Venda: " + totalVenda);
    }
}

