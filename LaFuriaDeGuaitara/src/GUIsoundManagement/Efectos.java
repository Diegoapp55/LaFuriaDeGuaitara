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
    public void playDialogoCura(){
        playNoLoop(".\\build\\classes\\soundFiles\\dialogoCura.wav");
    }
    public void playDialogoProta(){
        playNoLoop(".\\build\\classes\\soundFiles\\dialogoProtagonista.wav");
    }
    public void playDialogoSecu(){
        playNoLoop(".\\build\\classes\\soundFiles\\dialogoSecundario.wav");
    }
    public void playTexto(){
        playNoLoop(".\\build\\classes\\soundFiles\\lecturaTexto.wav");
    }
    public void playItem(){
        playNoLoop(".\\build\\classes\\soundFiles\\recogerItem.wav");
    }
    public void playItemEspecial(){
        playNoLoop(".\\build\\classes\\soundFiles\\itemEspecial.wav");
    }
    public void playAbrirMenu(){
        playNoLoop(".\\build\\classes\\soundFiles\\menuPrincipal.wav");
    }
    public void playPasosMadera(){
        playNoLoop(".\\build\\classes\\soundFiles\\pasosMadera.wav");
    }
    public void playPasosPiedra(){
        playNoLoop(".\\build\\classes\\soundFiles\\pasosPiedra.wav");
    }
    public void playPasosPiedraEco(){
        playNoLoop(".\\build\\classes\\soundFiles\\pasosPiedraReverb.wav");
    }
    public void playPasosTierra(){
        playNoLoop(".\\build\\classes\\soundFiles\\pasosTierra.wav");
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
}
