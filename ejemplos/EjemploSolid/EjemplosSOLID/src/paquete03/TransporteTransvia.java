/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author UTPL
 */
public class TransporteTransvia {

    private String TransporteTransvia;
    private double tarifa;
    
    public void establecerCooperativaTaxi(String n){
       TransporteTransvia = n;
    }
    
    public void establecerTarifa(){
        tarifa = 0.40 + (0.40*0.5);
    }
    
    public String obtenerCooperativaTaxi(){
        return TransporteTransvia;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
    
    
}