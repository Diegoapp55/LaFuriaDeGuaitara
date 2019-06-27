/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import GUI.PantallaJuego;

/**
 *
 * @author Diego
 */
public class Mapa {
    private PantallaJuego enlaceGUI;
    private ItemPickeable itemDelSuelo;
    private Obstaculo obstaculo;

    public Mapa(PantallaJuego enlaceGUI, ItemPickeable itemDelSuelo, Obstaculo obstaculo) {
        this.enlaceGUI = enlaceGUI;
        this.itemDelSuelo = itemDelSuelo;
        this.obstaculo = obstaculo;
    }

    public PantallaJuego getEnlaceGUI() {
        return enlaceGUI;
    }

    public void setEnlaceGUI(PantallaJuego enlaceGUI) {
        this.enlaceGUI = enlaceGUI;
    }

    public ItemPickeable getItemDelSuelo() {
        return itemDelSuelo;
    }

    public void setItemDelSuelo(ItemPickeable itemDelSuelo) {
        this.itemDelSuelo = itemDelSuelo;
    }

    public Obstaculo getObstaculo() {
        return obstaculo;
    }

    public void setObstaculo(Obstaculo obstaculo) {
        this.obstaculo = obstaculo;
    }
}
