import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nome;
    private double valor;
    private String ingredientes;

    public Pizza(String nome, double valor, String ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public static List<Pizza> criarCardapio() {
        List<Pizza> cardapio = new ArrayList<>();

        cardapio.add(new Pizza("Mussarela", 30.0, "Queijo mussarela, molho de tomate"));
        cardapio.add(new Pizza("Calabresa", 35.0, "Calabresa fatiada, cebola, molho de tomate"));
        cardapio.add(new Pizza("Portuguesa", 40.0, "Presunto, mussarela, cebola, ovos, azeitonas, ervilha, molho de tomate"));

        cardapio.add(new Pizza("Refrigerante", 5.0, "Coca-Cola, Guaraná, Sprite"));
        cardapio.add(new Pizza("Suco", 8.0, "Laranja, Uva, Limão"));

        cardapio.add(new Pizza("Chocolate", 25.0, "Chocolate ao leite, chocolate meio amargo"));
        cardapio.add(new Pizza("Banana com Canela", 30.0, "Banana, canela, leite condensado"));
        cardapio.add(new Pizza("Romeu e Julieta", 35.0, "Goiabada, queijo mussarela"));
        
        return cardapio;
    }
}
