 
package GUI;

import GUIsoundManagement.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;


public class VentanaMadre extends JFrame{
    public static Efectos botonSound = new Efectos();
    public VentanaMadre(){
        setSize(800,600);
        setTitle("La Furia de Guáitara");
        setLocationRelativeTo(null);
        /*close();*/
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Images/LFDGlogo.png")).getImage());
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
        botonSound.playSalir();
        int valor = JOptionPane.showConfirmDialog(this, "¿Desea Salir?", "SALIR", JOptionPane.YES_NO_OPTION , JOptionPane.WARNING_MESSAGE);
        if(valor == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }
    
}
