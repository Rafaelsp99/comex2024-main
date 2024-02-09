package br.com.alura.comex;

import Interfaces.IdentificarLivro;

public class Livro extends Produto implements IdentificarLivro {
    public Livro (String nome, String descricao,
                       int qunatidade ,float precoUnitario){
        criaProduto(nome, descricao, qunatidade ,precoUnitario);
    }
    public String isbn;
    public int totaldePaginas;

    public int anoPublicacao;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getTotaldePaginas() {
        return totaldePaginas;
    }

    public void setTotaldePaginas(int totaldePaginas) {
        this.totaldePaginas = totaldePaginas;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String getNOME() {
        return "Livro";
    }

    @Override
    public String getisbn() {
        return isbn;
    }
}