package br.com.alura.comex.modelos;

import Interfaces.IdentificarCliente;

//Crie as classes Cliente e Endereco
public class Cliente extends Endereco implements IdentificarCliente {

    private String Nome;
    private String CPF;
    private String Email;
    private String Profissao;
    private String Telefone;

    public void String(Endereco Endereco) {

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }



    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getProfissao() {
        return Profissao;
    }

    public void setProfissao(String profissao) {
        Profissao = profissao;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    @Override
    public String getNOME() {
        return "Cliente";
    }

    @Override
    public String getcpf() {
        return CPF;
    }

}
