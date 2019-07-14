/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI2;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class Prueba extends JPanel implements KeyListener{
    private JLayeredPane ly =  new JLayeredPane();
    private JLabel l = new JLabel();
    private JLabel fondo = new JLabel();
    Icon img = new ImageIcon(getClass().getResource("/Images/sprites/ProtaAndroFront.gif"));
    
    ImageIcon back = new ImageIcon(getClass().getResource("/Images/Iglesia.png"));
    
    
    
    public Prueba(){
        fondo.setIcon(back);
        
        //fondo.setLocation(0, 0);
        
        l.setIcon(img);
        l.setLocation(100, 200);
        addKeyListener(this);
        setFocusable(true);
        add(fondo);
        add(l);
        
        
        add(ly);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP :{
                l.setLocation(l.getX(), l.getY() - 5);
                break;
            }
            case KeyEvent.VK_DOWN :{
                l.setLocation(l.getX(), l.getY() + 5);
                break;
            }
            case KeyEvent.VK_LEFT :{
                l.setLocation(l.getX() - 5, l.getY());
                break;
            }
            case KeyEvent.VK_RIGHT :{
                l.setLocation(l.getX() + 5, l.getY());
                break;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    
}
