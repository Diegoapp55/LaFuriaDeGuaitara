/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.*;
import java.io.Serializable;
import javax.swing.*;

/**
 *
 * @author Diego
 */
public class ItemPickeable implements Serializable{
    private String nombre;
    private String descripcion;
    private double x;
    private double y;
    boolean recogido = false;
    private ImageIcon im;

    public ItemPickeable(String nombre, String descripcion, double x, double y, String ruta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
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
    
    public boolean spawn(){
        if(recogido){
            return false;
        }else{
            return true;
        }
    }
}
