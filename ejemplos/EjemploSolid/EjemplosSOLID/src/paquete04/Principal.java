/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */

public class Principal {
    public static void main(String[] args) {
        
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteTranvia tra = new TransporteTranvia();
        tra.setTranvia("Tranvia 1");
        tra.establecerTarifa();
        
        TransporteAereo ae = new TransporteAereo();
        ae.setAereo("avion ");
        ae.establecerTarifa();
        
        TransporteMaritimo mar = new TransporteMaritimo();
        mar.setMaritimo("Barco 1");
        mar.establecerTarifa();
 
        TiposTransporte tipos = new TiposTransporte();
        
        ArrayList<Transporte> lista = new ArrayList<>();
        lista.add(bus);
        lista.add(taxi);
        lista.add(tra);
        lista.add(ae);
        lista.add(mar);
        
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f", 
                tipos.obtenerPromedioTarifas());
        
    }
}
