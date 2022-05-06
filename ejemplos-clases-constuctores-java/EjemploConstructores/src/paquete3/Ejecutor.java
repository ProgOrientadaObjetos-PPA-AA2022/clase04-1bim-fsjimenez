/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

public class Ejecutor {
    public static void main(String[] args) {
        // Se crea un objeto
        // haciendo referencia al constructor por defecto
        FacturaTelefonica fac = new FacturaTelefonica();
        fac.calcularValorFactura(); 
        System.out.printf("Número telefónico: %s\n"
                + "Minutos mes: %.2f\nValor minuto: %.2f\n"
                + "Valor factura: %.2f\n", fac.obtenerNumeroTelefono(),
                fac.obtenerMinutosMes(),
                fac.obtenerValorMinuto(),
                fac.obtenerValorFactura());
        
        System.out.println("-------------------------------");
        
        fac.establecerMinutosMes(1000);
        fac.calcularValorFactura();
        System.out.printf("Número telefónico: %s\n"
                + "Minutos mes: %.2f\nValor minuto: %.2f\n"
                + "Valor factura: %.2f\n", fac.obtenerNumeroTelefono(),
                fac.obtenerMinutosMes(),
                fac.obtenerValorMinuto(),
                fac.obtenerValorFactura());
        
        /*
        FacturaTelefonica fac2 = new FacturaTelefonica();
        fac2.calcularValorFactura(); 
        System.out.printf("Número telefónico: %s\n"
                + "Minutos mes: %.2f\nValor minuto: %.2f\n"
                + "Valor factura: %.2f\n", fac2.obtenerNumeroTelefono(),
                fac2.obtenerMinutosMes(),
                fac2.obtenerValorMinuto(),
                fac2.obtenerValorFactura());
        */
    }
    
    
}
