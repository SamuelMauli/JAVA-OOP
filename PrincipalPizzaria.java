import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalPizzaria {
    public static void main(String[] args) {
        List<Pizza> cardapio = Pizza.criarCardapio();
        List<Pedido> pedidos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Pedir pizza");
            System.out.println("2. Cancelar pedido");
            System.out.println("3. Ver pedidos");
            System.out.println("4. Ver cardápio");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    fazerPedido(scanner, cardapio, pedidos);
                    break;
                case 2:
                    cancelarPedido(scanner, pedidos);
                    break;
                case 3:
                    verPedidos(pedidos);
                    break;
                case 4:
                    verCardapio(cardapio);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    Main.main(args);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void fazerPedido(Scanner scanner, List<Pizza> cardapio, List<Pedido> pedidos) {
        Pedido pedido = new Pedido();
        System.out.println("\nMenu de Pizzas:");
        for (int i = 0; i < cardapio.size(); i++) {
            System.out.println((i + 1) + ". " + cardapio.get(i).getNome() + " - R$ " + cardapio.get(i).getValor());
        }
        System.out.print("Escolha uma pizza pelo número: ");
        int numeroPizza = scanner.nextInt();
        Pizza pizzaEscolhida = cardapio.get(numeroPizza - 1);

        pedido.adicionarPizza(pizzaEscolhida);

        System.out.println("\nBebidas:");
        for (int i = 0; i < cardapio.size(); i++) {
            System.out.println((i + 1) + ". " + cardapio.get(i).getNome() + " - R$ " + cardapio.get(i).getValor());
        }
        System.out.print("Escolha uma bebida pelo número: ");
        int numeroBebida = scanner.nextInt();
        Pizza bebidaEscolhida = cardapio.get(numeroBebida - 1);

        pedido.adicionarPizza(bebidaEscolhida);

        scanner.nextLine(); 
        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();
        pedido.setNomeCliente(nomeCliente);
        System.out.print("Digite seu endereço: ");
        String enderecoEntrega = scanner.nextLine();
        pedido.setEnderecoEntrega(enderecoEntrega);

        pedidos.add(pedido);
        System.out.println("Pedido realizado com sucesso!");
    }

    private static void cancelarPedido(Scanner scanner, List<Pedido> pedidos) {
        System.out.print("Digite o ID do pedido que deseja cancelar: ");
        int idPedido = scanner.nextInt();
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == idPedido) {
                pedidos.remove(pedido);
                System.out.println("Pedido cancelado com sucesso!");
                return;
            }
        }
        System.out.println("Pedido não encontrado.");
    }

    private static void verPedidos(List<Pedido> pedidos) {
        System.out.println("\nPedidos:");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }

    private static void verCardapio(List<Pizza> cardapio) {
        System.out.println("\nCardápio:");
        for (Pizza pizza : cardapio) {
            System.out.println("- " + pizza.getNome() + " - R$ " + pizza.getValor());
        }
    }
}

