package data;

import Rooms.PanelJuego;
import GUI2.*;
import static GUI2.Window.cargaP1;
import static GUI2.Window.cargaP2;
import static GUI2.Window.jMain;
import GUIsoundManagement.Efectos;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Diego
 */
public class Teclado extends JPanel implements ActionListener, KeyListener{
    //falta que el juego pare
    public Timer tm = new Timer(5, this);
    public int x = 0, y = 0, velX = 0, velY = 0;
    public Tecla up = new Tecla(); 
    public Tecla down = new Tecla(); 
    public Tecla left = new Tecla(); 
    public Tecla right = new Tecla(); 
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
        //Necesitamos una funcion que nos diga en donde vamos a pintar el personaje
        //posicion(); //Esta función llama un punto, se sobreescribirá en cada panel
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        muestraPuerta();
        muestraGuarda();
        
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
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/iglesia.png"));
        JLabel fondo = new JLabel(image);
        add(fondo);
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
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
                //PanelMenuPausa menuJuego = new PanelMenuPausa();
                cargaMenuPausa();
                break;
            case KeyEvent.VK_I:
                Efectos e2 = new Efectos();
                e2.playPausa();
                //PanelMenuPausa menuJuego = new PanelMenuPausa();
                cargaInventario();
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
        eventos(e);
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

        public static JPanel cargaNext()
        {
            PanelJuego pj = new PanelJuego();
            pj.setSize(jMain.getWidth(), jMain.getHeight());
            pj.setLocation(0,0);
        
            jMain.removeAll();
            jMain.add(pj);
            jMain.revalidate();
            jMain.repaint();
        
            return pj;
        }
        
        public void eventos(KeyEvent e)
        {
           if (e.getKeyCode() == KeyEvent.VK_SPACE)
           {
               if((x >= 275 && x <= 325) && (y >= 185 && y <= 215)){
                    JOptionPane.showMessageDialog(this, "Ganastes");
                    velX = 0;
                    velY = 0;
                }   
           }
        }
        
        public void cargaMenuPausa()
        {
            ocultaRooms();
            PanelMenuPausa pj = new PanelMenuPausa();
            pj.setSize(jMain.getWidth(), jMain.getHeight());
            pj.setLocation(0,0);
        
            jMain.removeAll();
            jMain.add(pj);
            jMain.revalidate();
            jMain.repaint();
        }
        
        public void cargaInventario()
        {
            ocultaRooms();
            PanelInventario pj = new PanelInventario();
            pj.setSize(jMain.getWidth(), jMain.getHeight());
            pj.setLocation(0,0);
        
            jMain.removeAll();
            jMain.add(pj);
            jMain.revalidate();
            jMain.repaint();
        }
        
        public void ocultaRooms()
        {
            cargaP1().setVisible(false);
            cargaP2().setVisible(false);
        }
        
    public void muestraPuerta()
    {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        panel.setBounds(275,185,50,30);
        panel.setBackground(Color.yellow);
    }
    
    public void muestraGuarda()
    {  
        JPanel pane2 = new JPanel();
        pane2.setLayout(null);
        this.add(pane2);
        pane2.setBounds(375,285,50,30);
        pane2.setBackground(Color.blue);
    }
    
    public Point posicionP()
    {
        Point p = new Point();
        p.x = 0;
        p.y = 0;
        return p;
    }
}
