package br.com.alura.comex;


import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {



    Produto produto1 = new Produto();
    produto1.criaProduto("GELADEIRA 300 litros " , " ELETROLUX",
            10, 1850.80F);
    //6) Restringir visibilidade das propriedades do Produto

    Produto produto2 = new Produto();
    produto2.criaProduto("GELADEIRA 450 litros "," BRASTEMP",
            5,2850.80F);





        if (produto1 == produto2) {
            System.out.println ( "OS PRODUTOS SÃO IGUAIS");
        } else {
            System.out.println ( "OS PRODUTOS SÃO DIFERENTES");
        }

        if (produto1.getQunatidade() >= produto2.getQunatidade()) {
            System.out.println ( "\nATENÇÃO VENDEDORES, NOSSO ESTOQUE DE " + produto1.getNome() + produto1.getDescricao() +
                    " Está alto favor focar nas vendas deste item. ");
        } else {
            System.out.println ( "\nVENDEDORES FOQUEM EM VENDER " +  produto2.getNome() + produto2.getDescricao() );
        }

       // System.out.println("Em nosso estoque possuimos  " + produto1.getQunatidade()+ (" Unidades de ") + produto1.getNome() + (" ") + produto1.getDescricao() +(" Seu preçco unitário é R$: ") + produto1.getPrecoUnitario());
        //System.out.println("\n E também possuimos  " + produto2.getQunatidade()+ (" Unidades de ") + produto2.getNome() + (" ") + produto2.getDescricao() +(" Seu preçco unitário é R$: ") + produto2.getPrecoUnitario());

        // System.out.println (("\n O valor do estoque da " +  produto1.getNome() + (" ") + produto1.getDescricao() + (" é de R$  ") + produto1.calculaValorEstoque()));
        //System.out.println (("\n O valor do estoque da " +  produto2.getNome() + (" ") + produto2.getDescricao() + (" é de R$  ") + produto2.calculaValorEstoque()));
}
}
