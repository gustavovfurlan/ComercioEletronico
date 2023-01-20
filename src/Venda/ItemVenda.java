/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Venda;

import Produto.Produto;

/**
 *
 * @author Gabriel, Gustavo e Igor
 */
public class ItemVenda {

    private Produto produto;
    private float valor;
    private int quantidade;
    
    //Constructor

    public ItemVenda(Produto produto, float valor, int quantidade) {
        this.produto = produto;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    
    //Gets e Sets

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Itens \n" + 
               "Produto: " + produto + "\n" + 
               "Valor: " + valor + "\n" + 
               "Quantidade: " + quantidade + "\n";
    }
    
    
    
    
}
