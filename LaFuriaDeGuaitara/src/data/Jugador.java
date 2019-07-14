/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import javax.swing.ImageIcon;

/**
 *
 * @author Diego
 */
public class Jugador extends Personaje{
    //private Inventario inventario;
    private ImageIcon sprite = new ImageIcon();
    
    public Jugador(String nombre, String genero) {
        super(nombre, genero);
        //this.inventario = inventario;
    }

    /*public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }*/
    
    public String rutaImagen(String genero)
    {
        String rutaImagen = "";
        switch (genero)
                {
                    case "Hombre":
                    rutaImagen = "";
                    break;
                    case "Mujer":
                    rutaImagen = "";
                    break;
                    case "Otro":
                    rutaImagen = "";
                    break;
                    default:
                    rutaImagen = "";
                    break;
                }
                                
        return rutaImagen;
    }
    
}
