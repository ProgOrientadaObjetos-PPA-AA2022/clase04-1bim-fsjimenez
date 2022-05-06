/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

public class EjecutableDos {
    public static void main(String[] args) {
        // Se crea un objeto
        Computadora computadoraPersonal = new Computadora(9.12);
        Computadora computadoraPersona2 = new Computadora("Ryzen");
        Computadora computadoraPersona3 = new Computadora("Intel", 12);
        
        // Se asigna valores particulares al objeto
        // a través de los métodos establecer
        
        String procesador = "Intel";
        //double memoria = 8.2; // se asume que está expresada en GB
        computadoraPersonal.establecerTipoProcesador(procesador);
        //computadoraPersonal.establecerMemoria(memoria);
        
        // Se presenta valores en pantalla, rescatando los valores
        // que se necesita a través de los métodos obtener del
        // objeto 
        
        System.out.printf("%s\n", computadoraPersonal);
        System.out.printf("\n%s\n", computadoraPersona2);
        System.out.printf("\n%s\n", computadoraPersona3);
        
    }
}
