/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
class PuntoDeGuardado extends Personaje{
    private int estadoPartida;

    public PuntoDeGuardado(int estadoPartida, String nombre, String genero) {
        super(nombre, genero);
        this.estadoPartida = estadoPartida;
    }

    public int getEstadoPartida() {
        return estadoPartida;
    }

    public void setEstadoPartida(int estadoPartida) {
        this.estadoPartida = estadoPartida;
    }
    
    public ArrayList<Partida> guardarPartida(ArrayList<Partida> partidas){
        return partidas;
    }

    @Override
    public void moverse() {
        
    }
}
