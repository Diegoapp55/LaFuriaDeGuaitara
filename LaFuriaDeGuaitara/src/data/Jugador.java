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
public class Jugador extends Personaje{
    private Inventario inventario;

    public Jugador(Inventario inventario, String nombre, String genero) {
        super(nombre, genero);
        this.inventario = inventario;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    
    @Override
    public void moverse() {
        
    }
}
