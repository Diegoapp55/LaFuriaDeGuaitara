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
        play("C:\\Users\\HP\\Desktop\\La Furia\\LaFuriaDeGuaitara\\build\\classes\\soundFiles\\mainTheme.wav");
    }
    public void stopMainTheme(){
        stop("C:\\Users\\HP\\Desktop\\La Furia\\LaFuriaDeGuaitara\\build\\classes\\soundFiles\\mainTheme.wav");
    }
    public void playMenuTheme(){
        play("C:\\Users\\HP\\Desktop\\La Furia\\LaFuriaDeGuaitara\\build\\classes\\soundFiles\\menuTheme.wav");
    }
    public void stopMenuTheme(){
        stop("C:\\Users\\HP\\Desktop\\La Furia\\LaFuriaDeGuaitara\\build\\classes\\soundFiles\\menuTheme.wav");
    }
    public void playGamePlay(){
        play("C:\\Users\\HP\\Desktop\\La Furia\\LaFuriaDeGuaitara\\build\\classes\\soundFiles\\gamePlay[recortado].wav");
    }
    public void stopGamePlay(){
        stop("C:\\Users\\HP\\Desktop\\La Furia\\LaFuriaDeGuaitara\\build\\classes\\soundFiles\\gamePlay[recortado].wav");
    }
    public void playGamePlayTension(){
        play("C:\\Users\\HP\\Desktop\\La Furia\\LaFuriaDeGuaitara\\build\\classes\\soundFiles\\gamePlayTension[recortar].wav");
    }
    public void stopGamePlayTension(){
        stop("C:\\Users\\HP\\Desktop\\La Furia\\LaFuriaDeGuaitara\\build\\classes\\soundFiles\\gamePlayTension[recortar].wav");
    }
    public void playGamePlayCreepy(){
        play("C:\\Users\\HP\\Desktop\\La Furia\\LaFuriaDeGuaitara\\build\\classes\\soundFiles\\gamePlayCreepy[recortado].wav");
    }
    public void stopGamePlayCreepy(){
        stop("C:\\Users\\HP\\Desktop\\La Furia\\LaFuriaDeGuaitara\\build\\classes\\soundFiles\\gamePlayCreepy[recortado].wav");
    }
    public void playFinalPerder(){
        playNoLoop("C:\\Users\\HP\\Desktop\\La Furia\\LaFuriaDeGuaitara\\build\\classes\\soundFiles\\finalPerder.wav");
    }
    public void stopFinalPerder(){
        stop("C:\\Users\\HP\\Desktop\\La Furia\\LaFuriaDeGuaitara\\build\\classes\\soundFiles\\finalPerder.wav");
    }
    public void playFinalGanar(){
        playNoLoop("C:\\Users\\HP\\Desktop\\La Furia\\LaFuriaDeGuaitara\\build\\classes\\soundFiles\\finalGanar.wav");
    }
    public void stopFinalGanar(){
        stop("C:\\Users\\HP\\Desktop\\La Furia\\LaFuriaDeGuaitara\\build\\classes\\soundFiles\\finalGanar.wav");
    }
}
