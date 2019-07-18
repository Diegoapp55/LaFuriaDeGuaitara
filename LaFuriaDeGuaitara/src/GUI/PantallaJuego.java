/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Diego
 */
public class PantallaJuego extends VentanaMadre{
    private Mapa mapa;
    
    public PantallaJuego(){
        stage_1();
    }
    
    public Mapa getMapa() {
        return mapa;
    }

    public void setMapa(Mapa mapa) {
        this.mapa = mapa;
    }
    
    public void stage_1(){
    }  
}
