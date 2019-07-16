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
public class Pistas extends Sonido{
    public void playMainTheme(){
        play(".\\build\\classes\\soundFiles\\mainTheme.wav");
    }
    public void playMenuTheme(){
        play(".\\build\\classes\\soundFiles\\menuTheme.wav");
    }
    public void playGamePlay(){
        play(".\\build\\classes\\soundFiles\\gamePlay[recortado].wav");
    }
    public void playGamePlayTension(){
        play(".\\build\\classes\\soundFiles\\gamePlayTension[recortar].wav");
    }
    public void playGamePlayCreepy(){
        play(".\\build\\classes\\soundFiles\\gamePlayCreepy[recortado].wav");
    }
    public void playFinalPerder(){
        playNoLoop(".\\build\\classes\\soundFiles\\finalPerder.wav");
    }
    public void playFinalGanar(){
        playNoLoop(".\\build\\classes\\soundFiles\\finalGanar.wav");
    }
    public void playWind(){
        play(".\\build\\classes\\soundFiles\\wind.wav");
    }
    public void playRio(){
        playNoLoop(".\\build\\classes\\soundFiles\\rio.wav");
    }
}
