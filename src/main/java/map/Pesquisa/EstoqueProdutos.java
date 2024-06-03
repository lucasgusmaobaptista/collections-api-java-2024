package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> produtosMap;

    public EstoqueProdutos() {
        this.produtosMap = new HashMap<>();
    }

    public void adicionarProdutos(long cod, String nome, double preco, int quantidade) {
        produtosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(produtosMap);
    }

    public double calcularValorTotalEstoque() {
        double total = 0;
        if (!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                total += p.getPreco() * p.getQuantidade();
            }
        }
        return total;
    }

    public Produto obterProdutoMaisCaro() {
        Produto caro = null;
        double preco = Double.MIN_NORMAL;
        if (!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                if (p.getPreco() > preco) {
                    caro = p;
                }
            }
        }
        return caro;
    }
}


