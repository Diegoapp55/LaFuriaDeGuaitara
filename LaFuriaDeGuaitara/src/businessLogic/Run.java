/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import GUI.*;
import data.*;
import GUIsoundManagement.*;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Diego
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaMadre v1 =  new VentanaMadre();
        PantallaInicio panelInicio =  new PantallaInicio();
        v1.add(panelInicio);
        v1.setVisible(true);
    }
    
}
