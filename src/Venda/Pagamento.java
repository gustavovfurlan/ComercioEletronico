/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Venda;

/**
 *
 * @author Gabriel, Gustavo e Igor
 */
public class Pagamento {
    
    
    private int codigoNota;

    
    //Constructor
    
    public Pagamento(int codigoNota) {
        this.codigoNota = codigoNota;
    }
    
    
    //Get e Set

    public int getCodigoNota() {
        return codigoNota;
    }

    public void setCodigoNota(int codigoNota) {
        this.codigoNota = codigoNota;
    }

    @Override
    public  String toString() {
        return "Pagamento{" + "codigoNota=" + codigoNota + '}';
    }
    
    
    
    
}
