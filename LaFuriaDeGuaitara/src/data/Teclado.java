package data;

import GUI2.*;
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
    Tecla up = new Tecla(); 
    Tecla down = new Tecla(); 
    Tecla left = new Tecla(); 
    Tecla right = new Tecla(); 
    //boolean corriendo = false;
    
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
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        panel.setBounds(275,185,50,30);
        panel.setBackground(Color.yellow);
        
        determinarDireccion();
        
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
        switch(e.getKeyCode()){ //Falta mirar como hacer que se mueva diagonalmente
            case KeyEvent.VK_LEFT:
                left.teclaPulsada();
                break;
            case KeyEvent.VK_UP:
                up.teclaPulsada();
                break;
            case KeyEvent.VK_RIGHT:
                right.teclaPulsada();
                break;
            case KeyEvent.VK_DOWN:
                down.teclaPulsada();
                break;
            case KeyEvent.VK_SHIFT:
                tm.setDelay(3);
                break;
            case KeyEvent.VK_ESCAPE:
                Efectos e1 = new Efectos();
                e1.playPausa();
                PanelMenuPausa menuJuego = new PanelMenuPausa();
                break;
            case KeyEvent.VK_SPACE:
                if((x >= 275 && x <= 325) && (y >= 185 && y <= 215)){
                    JOptionPane.showMessageDialog(this, "Ganastes");
                    velX = 0;
                    velY = 0;
                }   
                break;
        }        
    }
    
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP:
                up.teclaLiberada();
                break;
            case KeyEvent.VK_DOWN:
                down.teclaLiberada();
                break;
            case KeyEvent.VK_LEFT:
                left.teclaLiberada();
                break;
            case KeyEvent.VK_RIGHT:
                right.teclaLiberada();
                break;
            case KeyEvent.VK_SHIFT:
                tm.setDelay(5);
                break;
        }
    }
    
    private void determinarDireccion() {
            final int velX = evaluarVelocidadX();
            final int velY = evaluarVelocidadY();

            if (velX == 0 && velY == 0) {
                    return;
            }

            if ((velX != 0 && velY == 0) || (velX == 0 && velY != 0)) {
                    mover(velX, velY);
            } else {
                // izquierda y arriba
                if (velX == -1 && velY == -1) {
                    if (left.obtenerUltimaPulsacion() > up.obtenerUltimaPulsacion()) {
                            mover(velX, 0);
                    } else {
                            mover(0, velY);
                    }
                }
                // izquierda y abajo
                if (velX == -1 && velY == 1) {
                    if (left.obtenerUltimaPulsacion() > down.obtenerUltimaPulsacion()) {
                            mover(velX, 0);
                    } else {
                            mover(0, velY);
                    }
                }
                // derecha y arriba
                if (velX == 1 && velY == -1) {
                    if (right.obtenerUltimaPulsacion() > up.obtenerUltimaPulsacion()) {
                            mover(velX, 0);
                    } else {
                            mover(0, velY);
                    }
                }
                // derecha y abajo
                if (velX == 1 && velY == 1) {
                    if (right.obtenerUltimaPulsacion() > down.obtenerUltimaPulsacion()) {
                            mover(velX, 0);
                    } else {
                            mover(0, velY);
                    }
                }
            }
	}
        
	private int evaluarVelocidadX() {
            int velX = 0;

            if (left.estaPulsada() && !right.estaPulsada()) {
                velX = -1;
            } else if (right.estaPulsada() && !left.estaPulsada()) {
                velX = 1;
            }

            return velX;
	}

	private int evaluarVelocidadY() {
            int velY = 0;

            if (up.estaPulsada() && !down.estaPulsada()) {
                velY = -1;
            } else if (down.estaPulsada() && !up.estaPulsada()) {
                velY = 1;
            }

            return velY;
	}

	private void mover(final int velX, final int velY) {
                       
            if (velX == -1) {
                x += velX;
            }
            if (velX == 1) {
                x += velX;
            }
            if (velY == -1) {
                y += velY;
            }
            if (velY == 1) {
                y += velY;
            }
	}
}
