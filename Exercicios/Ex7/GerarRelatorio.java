package Exercicios.Ex7;

import java.util.List;

public class GerarRelatorio {
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
