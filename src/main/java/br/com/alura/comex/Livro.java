package br.com.alura.comex;

public class Livro extends Produto {
    public Livro (String nome, String descricao,
                       int qunatidade ,float precoUnitario){
        criaProduto(nome, descricao, qunatidade ,precoUnitario);
    }
    public String isbn;
    public int totaldePaginas;

    public int anoPublicacao;
}