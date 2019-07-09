package businessLogic;

import GUI.MenuJuego;
import GUIsoundManagement.Efectos;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Diego
 */
public class Teclado extends JPanel implements ActionListener, KeyListener{
    //falta que el juego pare
    Timer tm = new Timer(5, this);
    int x = 0, y = 0, velX = 0, velY = 0;
    boolean mantieneUP = false;
    boolean mantieneDOWN = false;
    boolean mantieneLEFT = false;
    boolean mantieneRIGHT = false;
    
    public Teclado(){
        tm.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(x, y, 50, 30);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        x = x + velX;
        y = y + velY;
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        panel.setBounds(275,185,50,30);
        panel.setBackground(Color.yellow);
        
        if(x <= 0 ){
            velX = 0;
            x = 0;
        }
        if(x >= 750){
            velX = 0;
            x = 750;
        }
        if(y <= 0){
            velY = 0;
            y = 0;
        }
        if(y >= 540){
            velY = 0;
            y = 540;
        }
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        long tLeft = 0,tUp = 0,tRight = 0,tDown = 0;
        switch(c){ //Falta mirar como hacer que se puedan mantener 2 teclas a la vez
            case KeyEvent.VK_LEFT:
                velX = -1;
                velY = 0;
                tLeft = System.currentTimeMillis()/1000;
                mantieneLEFT = true;
                break;
            case KeyEvent.VK_UP:
                velX = 0;
                velY = -1;
                tUp = System.currentTimeMillis()/1000;
                mantieneUP = true;
                break;
            case KeyEvent.VK_RIGHT:
                velX = 1;
                velY = 0;
                tRight = System.currentTimeMillis()/1000;
                mantieneRIGHT = true;
                break;
            case KeyEvent.VK_DOWN:
                velX = 0;
                velY = 1;
                tDown = System.currentTimeMillis()/1000;
                mantieneDOWN = true;
                break;
        }
        /*if(e.getKeyCode() == KeyEvent.VK_LEFT){
            velX = -1;
            velY = 0;
        }
        if(e.getKeyCode() == KeyEvent.VK_UP){
            velX = 0;
            velY = -1;
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            velX = 1;
            velY = 0;
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            velX = 0;
            velY = 1;
        }*/
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            if((x >= 275 && x <= 325) && (y >= 185 && y <= 215)/*&& Accion presiona espacio*/ ){
                JOptionPane.showMessageDialog(this, "Ganastes");
                velX = 0;
                velY = 0;
            }   
        }
        
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
            Efectos e1 = new Efectos();
            e1.playPausa();
            MenuJuego menuJuego = new MenuJuego();
            
        } 
        if(e.getKeyCode() == KeyEvent.VK_SHIFT){
            tm.setDelay(3);
        } 
        
    }
    
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            mantieneLEFT = false;
            /*if(mantieneLEFT){
                velX = -1;
            }else{
                velX = 0;
            }*/
            if(mantieneRIGHT){
                velX = 1;
            }else{
                velX = 0;
            }
            if(mantieneUP){
                velY = -1;
            }else{
                velY = 0;
            }
            if(mantieneDOWN){
                velY = 1;
            }else{
                velY = 0;
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_UP){
            mantieneUP = false;
            if(mantieneLEFT){
                velX = -1;
            }else{
                velX = 0;
            }
            if(mantieneRIGHT){
                velX = 1;
            }else{
                velX = 0;
            }
            /*if(mantieneUP){
                velY = -1;
            }else{
                velY = 0;
            }*/
            if(mantieneDOWN){
                velY = 1;
            }else{
                velY = 0;
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            mantieneRIGHT = false;
            if(mantieneLEFT){
                velX = -1;
            }else{
                velX = 0;
            }
            /*if(mantieneRIGHT){
                velX = 1;
            }else{
                velX = 0;
            }*/
            if(mantieneUP){
                velY = -1;
            }else{
                velY = 0;
            }
            if(mantieneDOWN){
                velY = 1;
            }else{
                velY = 0;
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            mantieneDOWN = false;
            if(mantieneLEFT){
                velX = -1;
            }else{
                velX = 0;
            }
            if(mantieneRIGHT){
                velX = 1;
            }else{
                velX = 0;
            }
            if(mantieneUP){
                velY = -1;
            }else{
                velY = 0;
            }
            /*if(mantieneDOWN){
                velY = 1;
            }else{
                velY = 0;
            }*/
        }
        if(e.getKeyCode() == KeyEvent.VK_SHIFT){
            tm.setDelay(5);
        } 
    }
    
}
