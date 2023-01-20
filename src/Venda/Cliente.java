/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Venda;

import java.time.LocalDate;

/**
 *
 * @author Gabriel, Gustavo e Igor
 */
public class Cliente extends Usuario {
    
    protected LocalDate dataCadastro;
    protected boolean clienteOuro;
    
    
    //Constructor

    public Cliente(int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String email,LocalDate dataCadastro, boolean clienteOuro) {
        super(codigo, nome, cpf, rg, dataNascimento, endereco, cep, email);
        this.dataCadastro = dataCadastro;
        this.clienteOuro = clienteOuro;
    }
    
    //Gets e Sets

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public boolean isClienteOuro() {
        return clienteOuro;
    }

    public void setClienteOuro(boolean clienteOuro) {
        this.clienteOuro = clienteOuro;
    }
    
    
    
    
    @Override
    public String toString(){
        return super.toString() + 
                "Data do Cadastro: " + dataCadastro + "\n" +
                "Cliente Ouro: " + (clienteOuro ? "Sim" : "Nao");
    }
    
}
