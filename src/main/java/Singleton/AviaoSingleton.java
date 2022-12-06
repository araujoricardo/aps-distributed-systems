/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import java.util.HashSet;
import java.util.Set;


public class AviaoSingleton {
    
 private static AviaoSingleton INSTANCE;

    private Set<String> assentoDisponives;

    public static AviaoSingleton getINSTANCE() {

        if (INSTANCE == null) {
            synchronized (AviaoSingleton.class) {
                if (INSTANCE == null) { 
                    INSTANCE = new AviaoSingleton();
                }
            }
        }
        return INSTANCE;
    }

     AviaoSingleton() {
        this.assentoDisponives = new HashSet<>();
        assentoDisponives.add("1A");
        assentoDisponives.add("1B");

    }

    public boolean bookAssento(String assento) {
        return assentoDisponives.remove(assento);

    }
}
