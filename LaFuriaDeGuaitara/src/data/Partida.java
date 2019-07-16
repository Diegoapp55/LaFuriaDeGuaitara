/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import javax.swing.JPanel;

/**
 *
 * @author Diego
 */
public class Partida {
    private JPanel panelActual;
    private Jugador jugadorActual;

    public Partida(JPanel panelActual, Jugador jugadorActual) {
        this.panelActual = panelActual;
        this.jugadorActual = jugadorActual;
    }
        
    public Partida(){
    }
        

    public Jugador getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(Jugador jugadorActual) {
        this.jugadorActual = jugadorActual;
    }

    public JPanel getPanelActual() {
        return panelActual;
    }

    public void setPanelActual(JPanel panelActual) {
        this.panelActual = panelActual;
    }
    
    
}
