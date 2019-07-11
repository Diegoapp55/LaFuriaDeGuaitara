/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import businessLogic.Teclado;
import data.Mapa;
import javax.swing.*;

/**
 *
 * @author Diego
 */
public class PantallaJuego extends VentanaMadre{
    
    private Mapa mapa;
    
    public PantallaJuego(){
        stage_1();
    }
    
    public Mapa getMapa() {
        return mapa;
    }

    public void setMapa(Mapa mapa) {
        this.mapa = mapa;
    }
    
    public void stage_1(){
        Teclado t = new Teclado();
        this.add(t);
    }
    
    public void stage_2(){
        
    }
    
    public void stage_n(){
        
    }
    
    public void cinematicasFinal(){
        
    }
    
    public VentanaInventario inventario(){
        return null;
    }
    
    public MenuJuego opciones(){
        return null;
    }
    
    @Override
    public void confirmarSalida(){
        VentanaMadre.botonSound.playSalir();
        int valor = JOptionPane.showConfirmDialog(this, "¿Desea Salir?", "SALIR", JOptionPane.YES_NO_OPTION , JOptionPane.WARNING_MESSAGE);
        if(valor == JOptionPane.YES_OPTION){
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        PantallaInicio nuevaPantallaInicio = new PantallaInicio();
    }
}
