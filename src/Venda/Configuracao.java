/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Venda;

/**
 *
 * @author Gabriel, Gustavo e Igor
 */
public class Configuracao {
    
    private String arquivoVendas;
    private String arquivoProdutos;
    private String arquivoFabricantes;
    private String arquivoTransportadoras;
    private String arquivoClientes;
    private String arquivoGerentes;
    
    
    //Cosntructor

    public Configuracao(String arquivoVendas, String arquivoProdutos, String arquivoFabricantes, String arquivoTransportadoras, String arquivoClientes, String arquivoGerentes) {
        this.arquivoVendas = arquivoVendas;
        this.arquivoProdutos = arquivoProdutos;
        this.arquivoFabricantes = arquivoFabricantes;
        this.arquivoTransportadoras = arquivoTransportadoras;
        this.arquivoClientes = arquivoClientes;
        this.arquivoGerentes = arquivoGerentes;
    }
    
    //Gets e Sets

    public String getArquivoVendas() {
        return arquivoVendas;
    }

    public void setArquivoVendas(String arquivoVendas) {
        this.arquivoVendas = arquivoVendas;
    }

    public String getArquivoProdutos() {
        return arquivoProdutos;
    }

    public void setArquivoProdutos(String arquivoProdutos) {
        this.arquivoProdutos = arquivoProdutos;
    }

    public String getArquivoFabricantes() {
        return arquivoFabricantes;
    }

    public void setArquivoFabricantes(String arquivoFabricantes) {
        this.arquivoFabricantes = arquivoFabricantes;
    }

    public String getArquivoTransportadoras() {
        return arquivoTransportadoras;
    }

    public void setArquivoTransportadoras(String arquivoTransportadoras) {
        this.arquivoTransportadoras = arquivoTransportadoras;
    }

    public String getArquivoClientes() {
        return arquivoClientes;
    }

    public void setArquivoClientes(String arquivoClientes) {
        this.arquivoClientes = arquivoClientes;
    }

    public String getArquivoGerentes() {
        return arquivoGerentes;
    }

    public void setArquivoGerentes(String arquivoGerentes) {
        this.arquivoGerentes = arquivoGerentes;
    }

    @Override
    public String toString() {
        return "Configuracao" + 
                "Arquivo de Vendas: " + arquivoVendas + "n" +
                "Arquivo de Produtos: " + arquivoProdutos + "n" +
                "Arquivo de Fabricantes: " + arquivoFabricantes + "n" +
                "Arquivo de Transportadoras: " + arquivoTransportadoras + "n" + 
                "Arquivo de Clientes: " + arquivoClientes + "n" +
                "Arquivo de Gerentes: " + arquivoGerentes + "n";
    }
    
    
    
    
    
}
