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
public class FactoryProduto {
    
    public static Produto factoryMethod(String tipo, int codigo, String nome, String descricao, LocalDate dataFabricacao, float valor, Fabricante fabricante, boolean disponivel){
        switch(tipo){
            case "MOVEIS":
                return new Moveis(codigo,nome,descricao,dataFabricacao,valor,fabricante,disponivel);
            case "ELETRODOMESTICOS":
                return new Eletrodomesticos(codigo,nome,descricao,dataFabricacao,valor,fabricante,disponivel);
            case "ELETRONICOS":
                return new Eletronicos(codigo,nome,descricao,dataFabricacao,valor,fabricante,disponivel);
            case "VESTUARIO":
                return new Vestuario(codigo,nome,descricao,dataFabricacao,valor,fabricante,disponivel);
            default:
                return null;
        }
        
        
    }
    
}
