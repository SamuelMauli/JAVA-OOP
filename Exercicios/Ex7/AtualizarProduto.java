package Exercicios.Ex7;

import java.util.List;
import java.util.Scanner;

public class AtualizarProduto {
    public static void atualizarProduto(List<Produto> estoque, Scanner scanner) {
        System.out.print("Digite o código do produto a ser atualizado: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Produto produto = Main.buscarProdutoPorCodigo(estoque, codigo);
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
}
