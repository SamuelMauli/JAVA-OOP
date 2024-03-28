package Exercicios.Ex7;

import java.util.List;

public class BuscarProdutoPorCodigo {
    public static Produto buscarProdutoPorCodigo(List<Produto> estoque, int codigo) {
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }
}
