/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Diego
 */
public class ItemPickeable {
    private String nombre;
    private String descripcion;
    private String tipo;
    private double x;
    private double y;
    private ImageIcon im;

    public ItemPickeable(String nombre, String descripcion, String tipo, double x, double y, String ruta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.x = x;
        this.y = y;
        //im = new ImageIcon(this.getClass().getResource(ruta));
        //this.setIm(im); 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public ImageIcon getIm() {
        return im;
    }

    public void setIm(ImageIcon im) {
        this.im = im;
    }
    
    public void insertarItem(double x, double y){
        
    }
}
