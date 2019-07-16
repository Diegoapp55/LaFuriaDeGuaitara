/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Diego
 */
public class Jugador extends Personaje{
    //private Inventario inventario;
    //public ImageIcon sprite = getPersonaje(this.getGenero());
    //public JLabel spriteLabel = new JLabel(sprite);
    
    public Jugador(String nombre, String genero) {
        super(nombre, genero);
        //spriteLabel.setSize(25, 25);
        //this.inventario = inventario;
    }
    
   /* public ImageIcon getPersonaje(String genero)
    {
        ImageIcon s;
        switch (genero)
                {
                    case "Hombre":
                    s = new ImageIcon("/src/Images/sprites/ProtaMascFront.gif");
                    break;
                    case "Mujer":
                    s = new ImageIcon("/src/Images/sprites/ProtaFemFront.gif");
                    break;
                    case "Otro":
                    s = new ImageIcon("/src/Images/sprites/ProtaAndroFront.gif");
                    break;
                    default:
                    s = new ImageIcon("/src/Images/sprites/ProtaMascFront.gif");
                    break;
                }
                                
        return s;
    }*/
    public String getPersonaje(String genero)
    {
        String s = "";
        switch (genero)
                {
                    case "Hombre":
                    s = "/src/Images/sprites/ProtaMascFront.gif";
                    break;
                    case "Mujer":
                    s = "/src/Images/sprites/ProtaFemFront.gif";
                    break;
                    case "Otro":
                    s = "/src/Images/sprites/ProtaAndroFront.gif";
                    break;
                    default:
                    s = "/src/Images/sprites/ProtaMascFront.gif";
                    break;
                }
                                
        return s;
    }
    /*public JLabel labelImagen()
    {
        return spriteLabel;
    }*/
}
