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
public class Villano extends Personaje{

    public Villano(String nombre, String genero, String[] dialogos) {
        super(nombre, genero, dialogos);
    }
    
    public void ataque(){
        
    }

    @Override
    public void moverse() {
        
    }

    @Override
    public String dialogo(String[] dialogos) {
        return "";
    }
    
}
