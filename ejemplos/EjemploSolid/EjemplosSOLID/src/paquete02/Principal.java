/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
    
    Persona p1 = new Persona("Iván ", 18);
        
    Persona p2 = new Persona("Rick ", 38);

    Persona p3 = new Persona("Erik ", 19);    
      
    Persona p4 = new Persona("Eduardo ", 28);
        
     ArrayList<Persona> estudiantes = new ArrayList<>();
    
    estudiantes.add(p1);
    estudiantes.add(p2);
    estudiantes.add(p3);
    estudiantes.add(p4);
    
    OperacionesEstudiantes operaciones = new OperacionesEstudiantes(); 
    operaciones.establecerEstudiante(estudiantes);
    operaciones.establecerPromedioEdades();

        System.out.printf("%s\n", operaciones);
    
    }
}
