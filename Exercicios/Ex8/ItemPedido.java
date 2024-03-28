package Exercicios.Ex8;

public class ItemPedido {
    private Pizza pizza;
    private int quantidade;

    public ItemPedido(Pizza pizza, int quantidade) {
        this.pizza = pizza;
        this.quantidade = quantidade;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
