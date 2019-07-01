 
package GUI;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;


public class VentanaMadre extends JFrame{
    public VentanaMadre(){
        this.setSize(800,600);
        this.setTitle("La Furia de Guáitara");
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
            System.exit(0);
        }
    }
    
}
