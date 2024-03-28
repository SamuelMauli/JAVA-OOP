package Exercicios.Ex8;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cardapio cardapio = new Cardapio();
        Pedido pedido = new Pedido();

        exibirCardapio(cardapio);

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite seu endereço de entrega:");
        String enderecoEntrega = scanner.nextLine();

        boolean continuarPedido = true;
        while (continuarPedido) {
            System.out.println("Escolha uma pizza pelo número:");
            int numPizza = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner
            System.out.println("Quantas pizzas deseja?");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            Pizza pizzaSelecionada = cardapio.getPizzas().get(numPizza - 1);
            double valorPedido = pizzaSelecionada.getValor() * quantidade;

            pedido.adicionarItem(new ItemPedido(pizzaSelecionada, quantidade));
            System.out.println("Pedido adicionado: " + pizzaSelecionada.getNome() + " - Quantidade: " + quantidade + " - Valor: R$" + valorPedido);

            System.out.println("Deseja adicionar mais algum pedido? (s/n)");
            String continuar = scanner.nextLine();
            if (!continuar.equalsIgnoreCase("s")) {
                continuarPedido = false;
            }
        }

        pedido.setEnderecoEntrega(enderecoEntrega);
        exibirPedido(pedido);

        scanner.close();
    }

    public static void exibirCardapio(Cardapio cardapio) {
        System.out.println("----- Cardápio -----");
        List<Pizza> pizzas = cardapio.getPizzas();
        for (int i = 0; i < pizzas.size(); i++) {
            Pizza pizza = pizzas.get(i);
            System.out.println((i + 1) + ". " + pizza.getNome() + " - R$ " + pizza.getValor());
        }
    }

    public static void exibirPedido(Pedido pedido) {
        System.out.println("----- Pedido -----");
        List<ItemPedido> itens = pedido.getItens();
        for (ItemPedido item : itens) {
            Pizza pizza = item.getPizza();
            int quantidade = item.getQuantidade();
            double valorPedido = pizza.getValor() * quantidade;
            System.out.println(pizza.getNome() + " - Quantidade: " + quantidade + " - Valor: R$" + valorPedido);
        }
        System.out.println("Endereço de entrega: " + pedido.getEnderecoEntrega());
    }
}
