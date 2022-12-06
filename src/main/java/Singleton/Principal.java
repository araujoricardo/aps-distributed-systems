/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class Principal {
 public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
        agendarAssento("1A");
        agendarAssento("1A");

        AviaoSingleton aviaosingleton1 = new AviaoSingleton().getINSTANCE();
        AviaoSingleton aviaosingleton2 = null; 

        
        Constructor[] constructors =  AviaoSingleton.class.getDeclaredConstructors();
        
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            aviaosingleton2 = (AviaoSingleton) constructor.newInstance();
        }
        
        
        System.out.println(aviaosingleton1.hashCode());
        System.out.println(aviaosingleton2.hashCode());
    }

    private static void agendarAssento(String assento) {
        AviaoSingleton a = AviaoSingleton.getINSTANCE();
        System.out.println(a.bookAssento(assento));

    }
}
