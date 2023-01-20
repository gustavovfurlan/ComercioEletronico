/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Venda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Gabriel, Gustavo e Igor
 */
public class Venda {
    
    private int codigo;
    private Cliente cliente;
    private Gerente gerente;
    private LocalDate dataVenda;
    private LocalDate dataEntrega;
    private ArrayList<ItemVenda> itensVenda;
    private float valorTotal;
    private float valorComDesconto;
    private Pagamento formaPagamento;
    private Transportadora transportadora;
    
    
    
    public void calcularDataEntrega(){
        dataEntrega = dataVenda.plusDays(transportadora.getTempoDeEntrega());
    }
    
    public void calcularValorTotal(){
        Iterator<ItemVenda> iterator = itensVenda.iterator();
        valorTotal = 0;
        
        while(iterator.hasNext()){
            valorTotal += (iterator.next().getValor())*(iterator.next().getQuantidade());
        }
        
        if(cliente.clienteOuro){
            valorComDesconto = valorTotal - (valorTotal*0.03f);
        }else{
            valorComDesconto = valorTotal;
        }
    }
    
    //Constructor

    public Venda(int codigo, Cliente cliente, Gerente gerente, LocalDate dataVenda, LocalDate dataEntrega, ArrayList<ItemVenda> itensVenda, float valorTotal, float valorComDesconto, Pagamento formaPagamento, Transportadora transportadora) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.gerente = gerente;
        this.dataVenda = dataVenda;
        this.dataEntrega = dataEntrega;
        this.itensVenda = new ArrayList();
        this.valorTotal = valorTotal;
        this.valorComDesconto = valorComDesconto;
        this.formaPagamento = formaPagamento;
        this.transportadora = transportadora;
    }
    
    
    //Gets e Sets

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public ArrayList<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(ArrayList<ItemVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorComDesconto() {
        return valorComDesconto;
    }

    public void setValorComDesconto(float valorComDesconto) {
        this.valorComDesconto = valorComDesconto;
    }

    public Pagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    @Override
    public String toString() {
        return "Venda " + 
                "Codigo: " + codigo + "n" +
                "Cliente: " + cliente.getNome() + "n" +
                "Gerente: " + gerente.getNome() + "n" +
                "Data da venda: " + dataVenda + "n" +
                "Data da entrega: " + dataEntrega + "n" +
                "Itens da Venda: " + itensVenda.toString() + "n" + 
                "Valor Total: " + valorTotal + "n" +
                "Valor Com Desconto: " + valorComDesconto + "n" +
                "Forma de Pagamento: " + formaPagamento.toString() + "n" +
                "Transportadora: " + transportadora.getNome() + "n" ;
    }
    
    
    
    
    
}
