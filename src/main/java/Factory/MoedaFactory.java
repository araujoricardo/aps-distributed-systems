/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

public class MoedaFactory {
      public static Moeda criarMoeda(Pais pais){
        
        if(pais.equals(pais.BRASIL)){
        return new Real();
        } else if (pais.equals(pais.USA)){
           return new USDolar(); 
        }
        throw new IllegalArgumentException("NÃO EXISTE ESSE PAIS");
        
    }
    
}
