/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Venda;

import Produto.Fabricante;
import Produto.Produto;
import java.util.ArrayList;

/**
 *
 * @author Gabriel, Gustavo e Igor
 */
public class ComercioEletronico {
    
    private String nomeLoja;
    private ArrayList<Venda> vendas;
    private ArrayList <Produto> produtos;
    private ArrayList <Fabricante> fabricantes;
    private ArrayList <Transportadora> transportadoras;
    private ArrayList <Usuario> clientes;
    private ArrayList <Usuario> gerentes;
    private Configuracao configuracoes;
    
    
    //Constructor

    public ComercioEletronico(String nomeLoja, ArrayList<Venda> vendas, ArrayList<Produto> produtos, ArrayList<Fabricante> fabricantes, ArrayList<Transportadora> transportadoras, ArrayList<Usuario> clientes, ArrayList<Usuario> gerentes, Configuracao configuracoes) {
        this.nomeLoja = nomeLoja;
        this.vendas = new ArrayList();
        this.produtos = new ArrayList();
        this.fabricantes = new ArrayList();
        this.transportadoras = new ArrayList();
        this.clientes = new ArrayList();
        this.gerentes = new ArrayList();
        this.configuracoes = configuracoes;
    }
    
    //Gets e Sets

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(ArrayList<Venda> vendas) {
        this.vendas = vendas;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public ArrayList<Fabricante> getFabricantes() {
        return fabricantes;
    }

    public void setFabricantes(ArrayList<Fabricante> fabricantes) {
        this.fabricantes = fabricantes;
    }

    public ArrayList<Transportadora> getTransportadoras() {
        return transportadoras;
    }

    public void setTransportadoras(ArrayList<Transportadora> transportadoras) {
        this.transportadoras = transportadoras;
    }

    public ArrayList<Usuario> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Usuario> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Usuario> getGerentes() {
        return gerentes;
    }

    public void setGerentes(ArrayList<Usuario> gerentes) {
        this.gerentes = gerentes;
    }

    public Configuracao getConfiguracoes() {
        return configuracoes;
    }

    public void setConfiguracoes(Configuracao configuracoes) {
        this.configuracoes = configuracoes;
    }
    
    
    
}
