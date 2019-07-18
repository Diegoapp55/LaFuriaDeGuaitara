/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import data.ItemPickeable;
import java.io.Serializable;

/**
 *
 * @author Diego
 */
public class Mapa implements Serializable{
    private PantallaJuego enlaceGUI;
    private ItemPickeable itemDelSuelo;

    public Mapa(PantallaJuego enlaceGUI, ItemPickeable itemDelSuelo) {
        this.enlaceGUI = enlaceGUI;
        this.itemDelSuelo = itemDelSuelo;
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

}
