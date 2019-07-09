/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import GUI.VentanaInventario;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Inventario implements Serializable{
    private ArrayList<ItemPickeable> contenido;
    private VentanaInventario enlaceGUI;

    public ArrayList<ItemPickeable> getContenido() {
        return contenido;
    }

    public void setContenido(ArrayList<ItemPickeable> contenido) {
        this.contenido = contenido;
    }

    public VentanaInventario getEnlaceGUI() {
        return enlaceGUI;
    }

    public void setEnlaceGUI(VentanaInventario enlaceGUI) {
        this.enlaceGUI = enlaceGUI;
    }
}
