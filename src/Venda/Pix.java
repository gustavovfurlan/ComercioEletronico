/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Venda;

import java.util.Random;

/**
 *
 * @author Gabriel, Gustavo e Igor
 */
public class Pix extends Pagamento {
    
    private String codigoPix;
    
    //Constructor

    public Pix(int codigoNota,String codigoPix) {
        super(codigoNota);
        this.codigoPix = codigoPix;
    }
    
    public void gerarCodigoPix(){
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rand = new Random();
        char[] text = new char[20];
        for (int i = 0; i < 20; i++) {
            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }
        codigoPix = String.valueOf(text);
    }
    
    
  //Gets e Sets

    public String getCodigoPix() {
        return codigoPix;
    }

    public void setCodigoPix(String codigoPix) {
        this.codigoPix = codigoPix;
    }

    @Override
    public String toString() {
        return "Pix" + 
                "Codigo Pix: " + codigoPix + "\n";
    }
    
    
    
   
}
