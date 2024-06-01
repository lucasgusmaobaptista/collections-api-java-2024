package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void addProduto(String nome, double preco, int id, int quantidade) {
        produtoSet.add(new Produto(nome, preco, id, quantidade));
    }

    public Set<Produto> exibirPorodutosPorNome() {
        Set<Produto> produtosNome = new TreeSet<>(produtoSet);
        return produtosNome;
    }

    public Set<Produto> exibirPorodutosPorPreco() {
        Set<Produto> produtosPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPreco.addAll(produtoSet);
        return produtosPreco;
    }
}
