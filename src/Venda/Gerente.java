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
public class Gerente extends Usuario {
    
    protected float salario;
    protected String pis;
    protected LocalDate dataAdmissao;
    
    
    // Constructor

    public Gerente(int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String email,float salario, String pis, LocalDate dataAdmissao) {
        super(codigo, nome, cpf, rg, dataNascimento, endereco, cep, email);
        this.salario = salario;
        this.pis = pis;
        this.dataAdmissao = dataAdmissao;
    }
    
    
    // Gets e Sets

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    
    
    @Override
    public String toString(){
        return super.toString() + 
                "Salario: " + salario + "\n" +
                "Pis: " + pis + "\n" + 
                "Data de admissao: " + dataAdmissao + "\n";
    }
    
}
