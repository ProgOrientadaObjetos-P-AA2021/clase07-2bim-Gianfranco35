/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class TransporteTaxi extends Transporte {
    private String cooperativaTaxi;
    
    
    public void establecerCooperativaTaxi(String n){
        cooperativaTaxi = n;
    }
    
    
    public void establecerTarifa(){
        tarifa = 0.30 + (0.30*0.4);
    }
    
    
    public String obtenerCooperativaTaxi(){
        return cooperativaTaxi;
    }
        
    
}
