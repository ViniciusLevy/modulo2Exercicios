package modulo2Exercicios.aula0605ExercicioEstoque;

import java.util.ArrayList;
import java.util.List;

public class TesteEstoque {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Notebook", "Apple","Computador", "Eletrônicos", 10);
        Produto produto2 = new Produto("Notebook", "Samsung","Computador", "Eletrônicos", 8);

        System.out.println(produto1.getIdEstoque());
        System.out.println(produto2.getIdEstoque());

        List<Produto> produtos = new ArrayList<>();
        Estoque estoque = new Estoque("Estoque Computadores", produtos);

        estoque.adicionarProdutoNovo(produto1);
        estoque.adicionarProdutoNovo(produto2);

        System.out.println(estoque.getIdEstoque());

        estoque.listarProdutos();

        estoque.excluirProdutoId(produto1.getIdEstoque());

        estoque.listarProdutos();

        estoque.atualizarProduto(produto2.getIdEstoque());
        estoque.mostrarDetalhesProduto(produto1);

        estoque.listarProdutos();









    }
}
