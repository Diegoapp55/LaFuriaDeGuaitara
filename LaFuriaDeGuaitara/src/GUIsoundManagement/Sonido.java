/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIsoundManagement;

import java.applet.AudioClip;
import java.awt.HeadlessException;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;


public class Sonido {
    public void play(String archivo){
        InputStream music;
        try{
            File musicPath = new File(archivo);
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }else{
                JOptionPane.showMessageDialog(null, "error de sonido");
            } 
        }catch(UnsupportedAudioFileException | IOException | LineUnavailableException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "error de sonido");
        }
    }
    
    public void stop(String archivo){
        InputStream music;
        try{
            File musicPath = new File(archivo);
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.stop();
            }
        }catch(UnsupportedAudioFileException | IOException | LineUnavailableException e){
            JOptionPane.showMessageDialog(null, "error de sonido");
        }
    }
    
    public void playNoLoop(String archivo){
        InputStream music;
        try{
            File musicPath = new File(archivo);
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            }else{
                JOptionPane.showMessageDialog(null, "error de sonido");
            } 
        }catch(UnsupportedAudioFileException | IOException | LineUnavailableException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "error de sonido");
        }
    }
}
