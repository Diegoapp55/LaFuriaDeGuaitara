/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import GUI2.Window;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Diego
 */
public class Archivo {
    
    
    public static FileOutputStream fos = null;
    public static FileInputStream fis = null;
    
    public static ArrayList<Partida> leer(){
        ArrayList<Partida> partidasLoad = new ArrayList<>();
        
        try {
            fis = new FileInputStream("./src/partidas/Partidas.obj");
            
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            Object input = ois.readObject();
            partidasLoad = (ArrayList<Partida>) input;
            
            ois.close();
            Window.partidaList = partidasLoad;
            return partidasLoad;

        } catch (Exception e) {
            
        }
        return partidasLoad;
    }
    
    public static void escribir(){
        
        try {
            fos = new FileOutputStream("./src/partidas/Partidas.obj");
            
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for (Partida partAux: Window.partidaList)
            {
                oos.writeObject(partAux);
            }
            
            oos.close();
        } catch (Exception e) {
            
        } 
    }
}
