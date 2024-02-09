package br.com.alura.comex.modelos;

public class Produto {


    private String descricao;
    private String nome;
    private String nomeUsuario;
    private float precoUnitario;
    private int qunatidade;





    //6) Restringir visibilidade das propriedades do Produto
    //7) Crie uma instância de Produto obrigando o usuário a fornecer um nome
        public void criaProduto(String nome, String descricao,
                            int qunatidade ,float precoUnitario) {
            if (nome == null ) {
                throw new IllegalArgumentException("NOME NÃO PODE SER NULO.");
            }
        this.nome = nome;
        this.descricao = descricao;
        this.qunatidade = qunatidade;
        this.precoUnitario = precoUnitario;

    }



    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQunatidade() {
        return qunatidade;
    }

    public void setQunatidade(int qunatidade) {
        this.qunatidade = qunatidade;
    }

    public int calculaValorEstoque(){
        return (int) (getQunatidade() * getPrecoUnitario() );

    }



}



