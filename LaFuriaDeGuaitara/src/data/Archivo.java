/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Diego
 */
public class Archivo {
    private static File f1;
    private static FileWriter fw;
    private static BufferedWriter bw;
    private static PrintWriter pw;
    private FileReader fr;
    private BufferedReader br;
    
    public void leer(String nombreArchivo){
        
    }
    
    public void escribir(String nombreArchivo, ArrayList<Jugador> topPartidas){
        
    }
    
    public ArrayList<Partida> importar(String nombreArchivo){
        ArrayList<Partida> partidas = new ArrayList<>();
        
        return partidas;
    }
}
