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
public class TransporteAereo extends Transporte{
    
    private String Avion;
    
    public void setAereo(String n){   
        Avion = n;
    }
    public String getAereo(){
    return Avion;
    }
    
    @Override
    public void establecerTarifa() {
        tarifa = 100;
    }
}
