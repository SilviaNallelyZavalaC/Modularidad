/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularidad;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class principal {
    public static void main(String[]args){
       new principal().correr();
         
    }
    void correr(){
        ensender();
        subirVolumen ();
        cambioDeCanal();
        bajarVolumen();
        apagarTelevision();
        
    }
    void ensender (){
        System.out.println("ingresa el numero del canal:");
    }
    void subirVolumen (){
     System.out.println("subiendo el volumen");
    }
    void cambioDeCanal(){
          System.out.println("ingresa el numero del canal:");
           int canal = new Scanner (System.in).nextInt();
           CambiarCanal funcionCambio = new CambiarCanal();
           funcionCambio.cambiarCanal(canal);
           funcionCambio.canalAnterior(canal);
           funcionCambio.canalSiguiente(canal);
    }
    void bajarVolumen(){
        System.out.println("bajando el volumen");
    }
    void apagarTelevision(){
        System.out.println("apagar television");
    }
}
