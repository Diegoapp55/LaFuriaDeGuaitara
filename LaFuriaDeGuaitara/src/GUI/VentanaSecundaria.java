/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;


/**
 *
 * @author HP
 */
public class VentanaSecundaria extends JFrame{
    public VentanaSecundaria(){
        this.setSize(500,370);
        this.setTitle("");
        this.setLocationRelativeTo(null);
        close();
        this.setResizable(false);
        this.setIconImage(new ImageIcon(getClass().getResource("/Images/viejo desnudo.jpg")).getImage());
    }
    
    public void close(){
        try {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    confirmarSalida();
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void confirmarSalida(){
        int valor = JOptionPane.showConfirmDialog(this, "¿Desea Salir?", "SALIR", JOptionPane.YES_NO_OPTION , JOptionPane.WARNING_MESSAGE);
        if(valor == JOptionPane.YES_OPTION){
            this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        }
    }
    
}
