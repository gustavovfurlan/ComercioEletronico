/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produto;

import java.time.LocalDate;

/**
 *
 * @author Gabriel, Gustavo e Igor
 */
public abstract class Produto {
    
    protected int codigo;
    protected String nome;
    protected String descricao;
    protected LocalDate dataFabricacao;
    protected float valor;
    protected Fabricante fabricante;
    protected boolean disponivel;
    
    abstract float calcularValor();
    
    public boolean estaDisponivel(){
        
        if(disponivel == true){
            System.out.println("O produto esta disponivel");
        }else{
            System.out.println("O produto nao esta disponivel");
        }
        
        return disponivel;
    }
    
    
    //Constructor
    
    public Produto(int codigo, String nome, String descricao, LocalDate dataFabricacao, float valor, Fabricante fabricante, boolean disponivel) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.dataFabricacao = dataFabricacao;
        this.valor = valor;
        this.fabricante = fabricante;
        this.disponivel = disponivel;
    }
    
    
    //Gets e Sets
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }
    
    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
    public float getValor() {
        return valor;
    }
    
    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public Fabricante getFabricante() {
        return fabricante;
    }
    
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }
    
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    
    
    @Override
    public String toString() {
        return "Produto \n" +
                "Codigo: " + codigo + "\n" +
                "Nome: " + nome + "\n" +
                "Descricao: " + descricao + "\n" +
                "Data de fabricacao: " + dataFabricacao + "\n" +
                "Valor(s/imposto): R$" + valor + "\n" +
                "Fabricante: " + fabricante + "\n" +
                "Disponivel: " + (disponivel ? "Sim" : "Nao") + "\n" + 
                "Valor final do produto: R$" + this.calcularValor() + "\n";
    }
}
