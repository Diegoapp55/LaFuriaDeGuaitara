/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Diego
 */
class PuntoDeGuardado extends Personaje implements Serializable{
    private int estadoPartida;

    public PuntoDeGuardado(int estadoPartida, String nombre, String genero, String[] dialogos) {
        super(nombre, genero, dialogos);
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

    @Override
    public String dialogo(String[] dialogos) {
        return "";
    }
    
}
