/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.Serializable;

/**
 *
 * @author Diego
 */
public class Partida implements Serializable{
    private long tiempo;
    private PuntoDeGuardado puntoDeGuardadoActual;
    private Mapa mapaActual;
    private Jugador jugadorActual;

    public Partida(long tiempo, PuntoDeGuardado puntoDeGuardadoActual, Mapa mapaActual, Jugador jugadorActual) {
        this.tiempo = tiempo;
        this.puntoDeGuardadoActual = puntoDeGuardadoActual;
        this.mapaActual = mapaActual;
        this.jugadorActual = jugadorActual;
    }
        
    public Partida(){
    }
        
    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public PuntoDeGuardado getPuntoDeGuardadoActual() {
        return puntoDeGuardadoActual;
    }

    public void setPuntoDeGuardadoActual(PuntoDeGuardado puntoDeGuardadoActual) {
        this.puntoDeGuardadoActual = puntoDeGuardadoActual;
    }

    public Mapa getMapaActual() {
        return mapaActual;
    }

    public void setMapaActual(Mapa mapaActual) {
        this.mapaActual = mapaActual;
    }

    public Jugador getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(Jugador jugadorActual) {
        this.jugadorActual = jugadorActual;
    }
    
    public long contarTiempo(long tiempoTranscurrido){
        long tiempoActual = tiempoTranscurrido + 0;
        
        return tiempoActual;
    }
    
    @Override
    public String toString()
    {
        return jugadorActual + "   " + tiempo + ".";
    }
}
