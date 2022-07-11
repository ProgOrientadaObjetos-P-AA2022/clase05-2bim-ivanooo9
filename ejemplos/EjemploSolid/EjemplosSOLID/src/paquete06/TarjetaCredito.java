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

    public TarjetaCredito(int code, String name, int cupMax) {
       codigo = codigo;
        nombre = nombre;
        cuponMax = cuponMax;
    }

    public int obtenerCodigo() {
        return codigo;
    }

    public void establecerCodigo(int codigo) {
        codigo = codigo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        nombre = nombre;
    }

    public int obtenerCuponMax() {
        return cuponMax;
    }

    public void establecerCuponMax(int cuponMax) {
        cuponMax = cuponMax;
    }
    
   
    
    
    
    
    
}
