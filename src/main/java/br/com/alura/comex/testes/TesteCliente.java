//Resultado esperado
//Crie uma classe de teste para efetuar a criação desse objetos e criar a associação entre eles.
package br.com.alura.comex.testes;
//Crie as classes Cliente e Endereco

import br.com.alura.comex.modelos.Cliente;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("JOÃO PAULO SILVA ");
        cliente1.setCPF("362.625.895-58");
        cliente1.setEmail("joao@alura.com");
        cliente1.setProfissao("Advogado");
        cliente1.setTelefone("16 99145-7884");
        cliente1.setBairro("Nova York");
        cliente1.setCidade("Franca");
        cliente1.setComplemento("Apartamento 23");
        cliente1.setEstado("São Paulo");
        cliente1.setRua("Sebastão Antunes");
        cliente1.setNumero(925);

        System.out.println (cliente1.getNome()+ " CPF " + cliente1.getCPF() + "\n E-MAIL  " +
                cliente1.getEmail() + " " + cliente1.getProfissao() + " \n RESIDENTE EM " + cliente1.getCidade() +
                " " + cliente1.getEstado() + " BAIRRO " + cliente1.getBairro() + " RUA " + cliente1.getRua() +
                " " + cliente1.getNumero() + " " + cliente1.getComplemento() + "\n TELEFONE " + cliente1.getTelefone()) ;



    }
}