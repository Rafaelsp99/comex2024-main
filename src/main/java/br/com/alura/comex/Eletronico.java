package br.com.alura.comex;

public class Eletronico extends Produto {

    public Eletronico (String nome, String descricao,
                       int qunatidade ,float precoUnitario){
        criaProduto(nome, descricao, qunatidade ,precoUnitario);
    }
    public int Voltagem;
    public int Potencia;
}
