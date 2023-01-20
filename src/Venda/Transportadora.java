/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Venda;

/**
 *
 * @author Gabriel, Gustavo e Igor
 */
public class Transportadora {
    
    private int codigo;
    private int tempoDeEntrega;
    private String cnpj;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    
    //Constructor

    public Transportadora(int codigo, int tempoDeEntrega, String cnpj, String nome, String email, String telefone, String endereco) {
        this.codigo = codigo;
        this.tempoDeEntrega = tempoDeEntrega;
        this.cnpj = cnpj;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    
    //Gets e Sets

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTempoDeEntrega() {
        return tempoDeEntrega;
    }

    public void setTempoDeEntrega(int tempoDeEntrega) {
        this.tempoDeEntrega = tempoDeEntrega;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Transportadora \n" + 
                "Codigo: " + codigo + 
                "\nTempo de Entrega: " + tempoDeEntrega + 
                "\nCnpj: " + cnpj + 
                "\nNome: " + nome + 
                "\nEmail: " + email + 
                "\nTelefone: " + telefone + 
                "\nEndereco: " + endereco;
    }
    
}
