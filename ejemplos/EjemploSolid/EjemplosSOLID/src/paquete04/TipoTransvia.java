/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;
import java.util.ArrayList;

/**
 *
 * @author UTPL
 */
public class TipoTransvia {

    private String TransporteTransvia;
    private double tarifa;
    
    public void establecerNombreTransvia(String n){
       TransporteTransvia = n;
    }
    
    public void establecerTarifa(){
        tarifa = 0.40 + (0.40*0.5);
    }
    
    public String obtenerNombreTransvia(){
        return TransporteTransvia;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
    
    
}