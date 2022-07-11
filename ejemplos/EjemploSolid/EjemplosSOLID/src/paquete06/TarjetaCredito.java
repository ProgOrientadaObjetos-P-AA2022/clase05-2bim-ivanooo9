/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author SALA I
 */
public class TarjetaCredito {
    
    private int codigo;
    private String nombre;
    private int cuponMax;

    public TarjetaCredito(String name, int code, int cupMax) {
       codigo = code;
        nombre = name;
        cuponMax = cupMax;
    }

    public int obtenerCodigo() {
        return codigo;
    }

    public void establecerCodigo(int code) {
        codigo = code;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String name ) {
        nombre = name;
    }

    public int obtenerCuponMax() {
        return cuponMax;
    }

    public void establecerCuponMax(int cupMax) {
        cuponMax = cupMax;
    }
    
   
    
    
    
    
    
}
