/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI2;

import GUI.PantallaJuego;
import GUIsoundManagement.Efectos;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class PanelPasillo extends javax.swing.JPanel implements KeyListener{
    Icon img = new ImageIcon(getClass().getResource("/Images/sprites/" + 
            PanelCrearPartida.jugador.getGenero() + ".gif"));
    Efectos fx = new Efectos();
    
    int velocidad = 5;
    /**
     * Creates new form PanelPasillo
     */
    public PanelPasillo() {
        initComponents();
        addKeyListener(this);
        setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l = new javax.swing.JLabel();
        Profe = new javax.swing.JLabel();
        door = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l.setIcon(img);
        add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 50, 50));

        Profe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sprites/Daniel_Salazar.gif"))); // NOI18N
        add(Profe, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 60, 50));

        door.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/objetos/door.png"))); // NOI18N
        add(door, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 50, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Mapas/Pasillo.png"))); // NOI18N
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Profe;
    private javax.swing.JLabel background;
    private javax.swing.JLabel door;
    private javax.swing.JLabel l;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP :
                if(l.getY() >= 216){
                    l.setLocation(l.getX(), l.getY() - velocidad);
                }else{
                    l.setLocation(l.getX(), l.getY() - 0);
                }
                break;
            
            case KeyEvent.VK_DOWN :
                if(l.getY() <= 301){
                    l.setLocation(l.getX(), l.getY() + velocidad);
                }else{
                    l.setLocation(l.getX(), l.getY() + 0);
                }
                break;
            
            case KeyEvent.VK_LEFT :
                if(l.getX() >= 73){
                    l.setLocation(l.getX() - velocidad, l.getY());
                }else{
                    l.setLocation(l.getX() - 0, l.getY());
                }
                break;
            
            case KeyEvent.VK_RIGHT :
                if(l.getX() <= 695){
                    l.setLocation(l.getX() + velocidad, l.getY());
                }else{
                    l.setLocation(l.getX() + 0, l.getY());
                }
                break;
                
            case KeyEvent.VK_SHIFT :
                velocidad = 10;
                break;

            case KeyEvent.VK_SPACE:{
                //Puerta
                if((l.getX() >= 672 && l.getX() <= 700) && (l.getY() >= 239 && l.getY() <= 274)){
                    fx.playPuerta();
                    PantallaJuego pj = new PantallaJuego();
                    pj.setVisible(true);
                    pj.dispose();
                    cargarWin();
                }
                if((l.getX() >= 369 && l.getX() <= 442) && (l.getY() >= 217 && l.getY() <= 330)){
                    fx.playItemEspecial();
                    int value = JOptionPane.showConfirmDialog(this, "¿Desea Guardar?" , 
                            "Punto de guardado", JOptionPane.YES_NO_OPTION);
                    if(value == JOptionPane.YES_OPTION){
                        PanelCrearPartida.partida.setPanelActual(this);    
                    }
                }
                break;
            }
            
            case KeyEvent.VK_ESCAPE:{
                fx.playPausa();
                cargarPausa();
                break;
            }
            
            case KeyEvent.VK_I:{
                fx.playPausa();
                cargarInventario();
                break;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_SHIFT :
                velocidad = 5;
                break;
        }
    }
    
    public void cargarWin(){
        PanelWin pj = new PanelWin();
        pj.setSize(Window.getJpanel().getWidth(), Window.getJpanel().getHeight());
        pj.setLocation(0,0);
        
        Window.getJpanel().removeAll();
        Window.getJpanel().add(pj);
        Window.getJpanel().revalidate();
        Window.getJpanel().repaint();
    }
    
    public void cargarPausa(){
        PanelMenuPausa pm = new PanelMenuPausa();
        pm.setSize(Window.getJpanel().getWidth(), Window.getJpanel().getHeight());
        pm.setLocation(0,0);
        
        Window.getJpanel().removeAll();
        Window.getJpanel().add(pm);
        Window.getJpanel().revalidate();
        Window.getJpanel().repaint();
    }
    
    public void cargarInventario(){
        PanelInventario pm = new PanelInventario();
        pm.setSize(Window.getJpanel().getWidth(), Window.getJpanel().getHeight());
        pm.setLocation(0,0);
        
        Window.getJpanel().removeAll();
        Window.getJpanel().add(pm);
        Window.getJpanel().revalidate();
        Window.getJpanel().repaint();
    }
}
