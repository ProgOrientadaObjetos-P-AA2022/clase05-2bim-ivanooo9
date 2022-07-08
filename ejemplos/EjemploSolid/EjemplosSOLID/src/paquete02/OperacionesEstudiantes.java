/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    // private double edadminima;
    
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma = e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }
    
    public double obtenerPromedioEdades(){
        
        return promedioEdades;
    }
    
     public String toString(){
         String cadena = String.format("LIstado de Estudiante: \n");
         
         for(int i=0; i < estudiantes.size(); i++){
             cadena = String.format("%s\n Estudiante %d\n"
                     + "Nombre: %s\n", cadena, (i +1),
                     estudiantes.get(i).obtenerNombre());
         }
        
        cadena = String.format("%s\nPromedio estudiantes: %.2f\n",
                cadena, obtenerPromedioEdades());
        return cadena;
    }

     
    
}
