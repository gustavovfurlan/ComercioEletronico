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
public class Vestuario extends Produto {
    
    @Override
    public float calcularValor() {
        
        return this.getValor() + (this.getValor()*0.115f);
    }

    
    //Constructor
    
    public Vestuario(int codigo, String nome, String descricao, LocalDate dataFabricacao, float valor, Fabricante fabricante, boolean disponivel) {
        super(codigo, nome, descricao, dataFabricacao, valor, fabricante, disponivel);
    }
    
}
