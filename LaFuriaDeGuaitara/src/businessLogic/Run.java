/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import GUI.*;
import GUI2.*;
import data.*;
import GUIsoundManagement.*;
import java.awt.Graphics;
import java.util.ArrayList;
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
        /*VentanaMadre v1 =  new VentanaMadre();
        PantallaInicio panelInicio =  new PantallaInicio();
        
        v1.add(panelInicio);

        v1.setVisible(true);*/
        
        
        ItemPickeable item1 = new ItemPickeable("Abstracción", "Un topacio que crea "
            + "versiones digitales de lo que sea que toque.", "Gema", 0, 0, "/src/Images/Sprites/item/1_topazSheet.ong");
        ItemPickeable item2 = new ItemPickeable("Encapsulación", "Este rubí de sangre"
            + " puede aislar a su portador del mundo real.", "Gema", 0, 0, "/src/Images/Sprites/item/2_rubySheet.png");
        ItemPickeable item3 = new ItemPickeable("Herencia", "El safiro más preciado"
            + " del mundo, puede obtener la habilidad de cualquiera de sus gemas "
            + "gemelas.", "Gema", 0, 0, "/src/Images/Sprites/item/3_saphSheet.png");
        ItemPickeable item4 = new ItemPickeable("Polimorfismo", "El poder comportarse"
            + " de una manera dependiendo de su ambiente es la gran habilidad"
            + " de esta esmeralda", "Gema", 0, 0, "/src/Images/Sprites/item/4_emeraldSheet.png");
    
        ArrayList<ItemPickeable> invent = new ArrayList<>();
        invent.add(item1);
        invent.add(item2);
        invent.add(item3);
        invent.add(item4);
        
        PanelInventario.setInv(invent);
        
        Window v1 = new Window();
        v1.setVisible(true);
    }
    
}
