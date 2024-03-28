package Geral;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int proximoId = 1;

    private int id;
    private String nomeCliente;
    private String enderecoEntrega;
    private List<Pizza> pizzas;

    public Pedido() {
        this.id = proximoId++;
        this.pizzas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (Pizza pizza : pizzas) {
            total += pizza.getValor();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido #" + id + " - Cliente: " + nomeCliente + ", Endereço de entrega: " + enderecoEntrega + ", Valor total: R$ " + calcularValorTotal();
    }
}
