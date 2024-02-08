package br.com.alura.comex;

public class Eletronico extends Produto {

    public Eletronico (String nome, String descricao,
                       int qunatidade ,float precoUnitario){
        criaProduto(nome, descricao, qunatidade ,precoUnitario);
    }
    public int Voltagem;
    public int Potencia;

    public int getVoltagem() {
        return Voltagem;
    }

    public void setVoltagem(int voltagem) {
        Voltagem = voltagem;
    }

    public int getPotencia() {
        return Potencia;
    }

    public void setPotencia(int potencia) {
        Potencia = potencia;
    }
}
