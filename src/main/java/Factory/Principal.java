/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

public class Principal {

    public static void main(String[] args) {

        Moeda moeda = MoedaFactory.criarMoeda(Pais.BRASIL);
        Moeda moeda2 = MoedaFactory.criarMoeda(Pais.USA);

        System.out.println(moeda.getsimbolo());
        System.out.println(moeda2.getsimbolo());

    }

}
