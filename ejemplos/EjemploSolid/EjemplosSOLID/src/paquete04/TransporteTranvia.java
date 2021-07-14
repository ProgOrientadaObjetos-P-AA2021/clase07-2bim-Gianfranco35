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
public class TransporteTranvia extends Transporte{
    
    private String tranvia;
    
    public void setTranvia(String n){   
        tranvia = n;
    }
    public String getTranvia(){
    return tranvia;
    }
    
    @Override
    public void establecerTarifa() {
        tarifa = 1;
    }
}
