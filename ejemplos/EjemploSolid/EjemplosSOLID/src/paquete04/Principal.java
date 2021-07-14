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
        
        TransporteTranvia tran = new TransporteTranvia();
        tran.setTranvia("Tranvia");
        tran.establecerTarifa();
        
        TransporteAereo aereo = new TransporteAereo();
        aereo.setAereo("Avion");
        aereo.establecerTarifa();
        
        TrasporteMarino marino = new TrasporteMarino();
        marino.setMaritimo("Barco");
        marino.establecerTarifa();
 
        TiposTransporte tipos = new TiposTransporte();
        
        ArrayList<Transporte> lista = new ArrayList<>();
        lista.add(bus);
        lista.add(taxi);
        lista.add(tran);
        lista.add(aereo);
        lista.add(marino);
        
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f", 
                tipos.obtenerPromedioTarifas());
        
    }
}
