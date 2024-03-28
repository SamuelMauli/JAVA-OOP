package Exercicios.Ex7;

import java.util.List;
import java.util.Scanner;

public class AdicionarProduto {
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
}
