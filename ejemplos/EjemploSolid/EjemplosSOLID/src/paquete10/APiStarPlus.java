/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

/**
 *
 * @author marco
 */
public class APiStarPlus implements APIMovie{
    private String apiKey;

    
     @Override
    public void establecerApiKey(String ak){
        apiKey = ak+123123;
    }

    
   @Override
    public String obtenerApiKey(){
        return apiKey;
    }

      public String toSting() {
        return String.format("Star PLus: , %s", obtenerApiKey());
    }
}




