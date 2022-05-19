package modulo2Exercicios.aula0605ExercicioEstoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {

   private int idEstoque;
   public String nome;
   private List<Produto> produtos = new ArrayList<>();
   private static int contadorId = 0;

   public Estoque(String nome, List<Produto> produtos) {
      this.nome = nome;
      this.produtos = produtos;
      inicializarId();
   }

   private void inicializarId(){
      contadorId++;
      this.idEstoque = contadorId;
   }

   public List<Produto> getProdutos() {
      return produtos;
   }

   public int getIdEstoque() {
      return idEstoque;
   }

   public void listarProdutos() {
      if (produtos.isEmpty()) {
         System.out.println("Não há registros de produtos");
      } else {
         for (Produto produto: produtos) {
            mostrarInfoProduto(produto);
         }
      }
   }

   public void adicionarProdutoNovo(Produto produtoNovo) {
      if (!verificarProdutoExiste(produtoNovo)) {
         produtos.add(produtoNovo);
      }
   }

   private boolean verificarProdutoExiste(Produto produtoNovo) {
      for (Produto produto: produtos) {
         if (produto.getNome().equalsIgnoreCase(produtoNovo.getNome())) {
            if (produto.getMarca().equalsIgnoreCase(produtoNovo.getMarca())) {
               produtoNovo.setQuantidadeEstoque(produtoNovo.getQuantidadeEstoque() + produto.getQuantidadeEstoque());
               return true;
            }
         }
      }
      return false;
   }

   public void excluirProdutoId(int idEstoque) {
      for (Produto produto: produtos) {
         if (produto.getIdEstoque() == idEstoque) {
            produtos.remove(produto.getIdEstoque() - 1);
            System.out.println("Produto Deletado");
            break;
         }
      }
   }
   

   public void atualizarProduto(int idEstoque) {
      for (Produto produto: produtos) {
         if (produto.getIdEstoque() == idEstoque) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Insira o nome do produto: ");
            produto.setNome(entrada.nextLine());

            System.out.print("Insira a marca do produto: ");
            produto.setMarca(entrada.nextLine());

            System.out.print("Insira a quantidade do produto em estoque: ");
            produto.setQuantidadeEstoque(Integer.parseInt(entrada.nextLine()));

            System.out.print("Insira a sessão do produto: ");
            produto.setSessao(entrada.nextLine());

            System.out.print("Insira o tipo do produto: ");
            produto.setTipo(entrada.nextLine());

            entrada.close();
         }
      }
   }

   public void mostrarDetalhesProduto(Produto produto) {
      if (verificarProdutoExiste(produto)) {
         mostrarInfoProduto(produto);
      } else {
         System.out.println("Produto não existe");
      }
   }

   private void mostrarInfoProduto(Produto produto) {
      System.out.println("Id: " + produto.getIdEstoque());
      System.out.println("Nome: " + produto.getNome());
      System.out.println("Sessão: " + produto.getSessao());
      System.out.println("Tipo: " + produto.getTipo());
      System.out.println("Marca: " + produto.getMarca());
      System.out.println("Quantidade: " +produto.getQuantidadeEstoque());
   }
}
