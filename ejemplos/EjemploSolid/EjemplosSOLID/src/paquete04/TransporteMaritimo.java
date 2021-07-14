/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author Asus
 */
public class TransporteMaritimo extends Transporte{
    
    private String barco;
    
    public void setMaritimo(String n){   
        barco = n;
    }

    public String getMaritimo(){
    return barco;
    }
    
    @Override
    public void establecerTarifa() {
        tarifa = 50;
    }
}
