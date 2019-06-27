/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Diego
 */
public abstract class Personaje implements Accion{
    private String nombre;
    private String genero;
    private String[] dialogos;

    public Personaje(String nombre, String genero, String[] dialogos) {
        this.nombre = nombre;
        this.genero = genero;
        this.dialogos = dialogos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String[] getDialogos() {
        return dialogos;
    }

    public void setDialogos(String[] dialogos) {
        this.dialogos = dialogos;
    }
}
