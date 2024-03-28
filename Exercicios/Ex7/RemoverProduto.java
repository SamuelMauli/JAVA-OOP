package Exercicios.Ex7;

import java.util.List;
import java.util.Scanner;

public class RemoverProduto {
    public static void removerProduto(List<Produto> estoque, Scanner scanner) {
        System.out.print("Digite o código do produto a ser removido: ");
        int codigo = scanner.nextInt();

        Produto produto = Main.buscarProdutoPorCodigo(estoque, codigo);
        if (produto != null) {
            estoque.remove(produto);
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
