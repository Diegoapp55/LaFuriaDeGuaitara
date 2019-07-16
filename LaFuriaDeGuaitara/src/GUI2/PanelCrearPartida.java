/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI2;

import static GUI2.PanelCrearPartida.jugador;
import GUIsoundManagement.Efectos;
import data.ItemPickeable;
import data.Jugador;
import data.Partida;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class PanelCrearPartida extends javax.swing.JPanel {
    public static Icon img;
    public static Partida partida = new Partida(null, null);
    public static Jugador jugador = new Jugador(null, null);
    public static ArrayList<ItemPickeable> inventario = new ArrayList<>();
    
    /**
     * Creates new form panelCrearPartida
     */
    public PanelCrearPartida() {
        jugador.inventario = inventario;
        initComponents();
        rbtUndefined.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgGrupo1 = new javax.swing.ButtonGroup();
        l = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        rbtFemale = new javax.swing.JRadioButton();
        rbtMale = new javax.swing.JRadioButton();
        rbtUndefined = new javax.swing.JRadioButton();
        btVolver = new javax.swing.JButton();
        btContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l.setIcon(img);
        l.setVisible(false);
        add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 60, 60));

        txtNombre.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setText("Nombre");
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 370, 30));

        rbtFemale.setBackground(new java.awt.Color(153, 153, 255));
        btgGrupo1.add(rbtFemale);
        add(rbtFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        rbtMale.setBackground(new java.awt.Color(153, 153, 255));
        btgGrupo1.add(rbtMale);
        add(rbtMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 20, -1));

        rbtUndefined.setBackground(new java.awt.Color(153, 153, 255));
        btgGrupo1.add(rbtUndefined);
        add(rbtUndefined, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, -1));

        btVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btMenuVolver.png"))); // NOI18N
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });
        add(btVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 150, 40));

        btContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btcontinuarr.png"))); // NOI18N
        btContinuar.setPreferredSize(new java.awt.Dimension(150, 40));
        btContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContinuarActionPerformed(evt);
            }
        });
        add(btContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackNuevaPartida.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        Efectos e1 = new Efectos();
        e1.playClickCerrar();
        Window.TEMA_MENU.stop();
        cargaPantallaInicio();
    }//GEN-LAST:event_btVolverActionPerformed

    private void btContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContinuarActionPerformed
        Efectos e1 = new Efectos();
        if(txtNombre.getText().equals("Nombre") || txtNombre.getText().isEmpty()){
            e1.playSalir();
            JOptionPane.showConfirmDialog(this, "Nombre demasiado corto" , "Error", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        }else if(txtNombre.getText().length() > 10){
            e1.playSalir();
            JOptionPane.showConfirmDialog(this, "Por favor ingresa un nombre de\n       10 caracteres o menos" , "Error", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        }else{
            Window.TEMA_MENU.stop();
            e1.playClickPositivo();
            
            jugador.setNombre(txtNombre.getText());
        
            if(rbtFemale.isSelected()){
                jugador.setGenero("Mujer");
            }else if(rbtMale.isSelected()){
                jugador.setGenero("Hombre");
            }else if(rbtUndefined.isSelected()){
                jugador.setGenero("Otro");
            }
            partida.setJugadorActual(jugador);
            Window.partidaList.add(partida);
            img = new ImageIcon(getClass().getResource("/Images/sprites/" + 
            jugador.getGenero() + ".gif"));
            cargaCinematica();
        } 
    }//GEN-LAST:event_btContinuarActionPerformed

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        txtNombre.setText("");
    }//GEN-LAST:event_txtNombreMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btContinuar;
    private javax.swing.JButton btVolver;
    private javax.swing.ButtonGroup btgGrupo1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel l;
    private javax.swing.JRadioButton rbtFemale;
    private javax.swing.JRadioButton rbtMale;
    private javax.swing.JRadioButton rbtUndefined;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    public void cargaCinematica()
    {
        PanelCine pcp = new PanelCine();
        pcp.setSize(Window.getJpanel().getWidth(), Window.getJpanel().getHeight());
        pcp.setLocation(0,0);
        
        Window.getJpanel().removeAll();
        Window.getJpanel().add(pcp);
        Window.getJpanel().revalidate();
        Window.getJpanel().repaint();

    }
    
    public void cargaPantallaInicio()
    {
        PanelInicio pcp = new PanelInicio();
        pcp.setSize(Window.getJpanel().getWidth(), Window.getJpanel().getHeight());
        pcp.setLocation(0,0);
        
        Window.getJpanel().removeAll();
        Window.getJpanel().add(pcp);
        Window.getJpanel().revalidate();
        Window.getJpanel().repaint();
    }
    
    public static int guardaPosX()
    {
        int posX = 0;
        posX = l.getX();
        return posX;
    }
    
    public static int guardaPosY()
    {
        int posY = 0;
        posY = l.getY();
        return posY;
    }
}
