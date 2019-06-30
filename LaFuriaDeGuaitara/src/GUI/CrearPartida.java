
package GUI;

import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Font;
import javax.swing.*;


public class CrearPartida extends VentanaSecundaria{
    
    public CrearPartida(){
        JPanel panel =  new JPanel();
        this.add(panel);
        panel.setLayout(null);
        
        JLabel titulo = new JLabel("Crear nueva partida");
        titulo.setBounds(50,100,200,40);
        titulo.setFont(new Font("consolas", Font.BOLD , 30));
        
        panel.add(titulo);
    }
    
    public Tutorial mostrarTutorial(){
        return null;
    }
    
    public PantallaJuego partidaCreada(){
        return null;
    }
}
