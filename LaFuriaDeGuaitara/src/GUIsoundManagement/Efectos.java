/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIsoundManagement;

/**
 *
 * @author Diego
 */
public class Efectos extends Sonido{
    public void playClickPositivo(){
        playNoLoop(".\\build\\classes\\soundFiles\\clickPositivo.wav");
    }
    public void playClickCerrar(){
        playNoLoop(".\\build\\classes\\soundFiles\\cerrarCancelar.wav");
    }
    public void playItem(){
        playNoLoop(".\\build\\classes\\soundFiles\\recorgerItem.wav");
    }
    public void playItemEspecial(){
        playNoLoop(".\\build\\classes\\soundFiles\\itemEspecial.wav");
    }
    public void playAbrirMenu(){
        playNoLoop(".\\build\\classes\\soundFiles\\menuPrincipal.wav");
    }
    public void playPausa(){
        playNoLoop(".\\build\\classes\\soundFiles\\pausa.wav");
    }
    public void playQuitarPausa(){
        playNoLoop(".\\build\\classes\\soundFiles\\quitarPausa.wav");
    }
    public void playSalir(){
        playNoLoop(".\\build\\classes\\soundFiles\\salirJuego.wav");
    }
    public void playPuerta(){
        playNoLoop(".\\build\\classes\\soundFiles\\puerta.wav");
    }
}
