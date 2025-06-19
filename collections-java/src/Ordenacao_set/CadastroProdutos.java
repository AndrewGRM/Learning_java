package Ordenacao_set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome,double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(123, "Chocolate", 8.00, 1);
        cadastroProdutos.adicionarProduto(456, "Barra de cereal", 10.00, 5);
        cadastroProdutos.adicionarProduto(789, "Bolacha", 2.50, 1);
        cadastroProdutos.adicionarProduto(987, "Desodorante", 20.00, 1);

        System.out.println(cadastroProdutos.produtoSet);
        System.out.println(cadastroProdutos.exibirProdutoPorNome());
        System.out.println(cadastroProdutos.exibirProdutoPorPreco());
    }
}
