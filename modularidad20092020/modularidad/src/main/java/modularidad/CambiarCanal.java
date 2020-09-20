/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularidad;

/**
 *
 * @author Hogar
 */
public class CambiarCanal {
    void cambiarCanal (int numeroCanal){
        System.out.println("Haz cambiado el canal"+numeroCanal);
    }
    void canalSiguiente(int numeroCanal){
        System.out.println("haz cambiado al canal" +(++numeroCanal));
    }
    void canalAnterior(int numeroCanal){
        System.out.println("haz cambiado al canal"+(--numeroCanal));
    }
}
