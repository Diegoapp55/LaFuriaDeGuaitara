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
 * @author JuanDa
 */
public class Archivo {

    public void escribeFichero(String fichero, Partida partidaGuardar)
    {
        try
        {
            ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream(fichero));
            oos.writeObject(partidaGuardar);
            oos.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    public ArrayList<Partida> leeFichero(String fichero)
    {
        ArrayList<Partida> listaAux = new ArrayList<>();
        Partida partAux = new Partida();
        try
        {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));
            Object aux = ois.readObject();
            
            while (aux!=null)
            {
                if (aux instanceof Partida)
                {
                    aux = ois.readObject();
                    partAux = (Partida) aux;
                }
            }
            ois.close();
        }
        catch (EOFException e1)
        {
            System.out.println ("Fin de fichero");
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
        return listaAux;
    }
}