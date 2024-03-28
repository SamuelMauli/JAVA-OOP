package Exercicios.Ex8;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Pizza> pizzas;

    public Cardapio() {
        this.pizzas = new ArrayList<>();
        inicializarCardapio();
    }

    private void inicializarCardapio() {
        // Pizzas salgadas
        pizzas.add(new Pizza("Calabresa", 30.0, new String[]{"Molho de tomate", "Calabresa", "Cebola", "Mussarela"}));
        pizzas.add(new Pizza("Frango com Catupiry", 35.0, new String[]{"Molho de tomate", "Frango desfiado", "Catupiry", "Mussarela"}));
        pizzas.add(new Pizza("Marguerita", 28.0, new String[]{"Molho de tomate", "Manjericão", "Tomate", "Mussarela"}));

        // Pizzas doces
        pizzas.add(new Pizza("Chocolate", 25.0, new String[]{"Chocolate ao leite", "Chocolate branco", "Morango"}));
        pizzas.add(new Pizza("Banana com Canela", 27.0, new String[]{"Banana", "Canela", "Leite condensado"}));
        pizzas.add(new Pizza("Romeu e Julieta", 30.0, new String[]{"Goiabada", "Queijo"}));
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }
}
