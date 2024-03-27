import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<Produto> itensVenda;

    public Venda() {
        this.itensVenda = new ArrayList<>();
    }

    public void adicionarItem(Produto produto) {
        itensVenda.add(produto);
    }

    public void removerItem(Produto produto) {
        itensVenda.remove(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : itensVenda) {
            total += produto.getPreco();
        }
        return total;
    }

    public List<Produto> getItensVenda() {
        return itensVenda;
    }
}

