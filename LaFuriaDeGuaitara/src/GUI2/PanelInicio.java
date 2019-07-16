/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI2;

import GUIsoundManagement.Efectos;
import GUIsoundManagement.Pistas;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class PanelInicio extends javax.swing.JPanel {
    /**
     * Creates new form panelInicio
     */
    public PanelInicio() {
        //TEMA_MENU.playMenuTheme();
        initComponents(); 
        Window.TEMA_PRINCIPAL.playMainTheme();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btNuevaPartida = new javax.swing.JButton();
        btCargarPartida = new javax.swing.JButton();
        btMenuOpciones = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btNuevaPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btNuevaPartida.png"))); // NOI18N
        btNuevaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevaPartidaActionPerformed(evt);
            }
        });
        add(btNuevaPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 200, 50));

        btCargarPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btCargarPartida.png"))); // NOI18N
        btCargarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCargarPartidaActionPerformed(evt);
            }
        });
        add(btCargarPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 200, 50));

        btMenuOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btOpciones.png"))); // NOI18N
        btMenuOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuOpcionesActionPerformed(evt);
            }
        });
        add(btMenuOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 200, 50));

        btSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btSalir.png"))); // NOI18N
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        add(btSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 200, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MainTitle.png"))); // NOI18N
        Fondo.setAlignmentY(0.0F);
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btNuevaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevaPartidaActionPerformed
        // TODO add your handling code here:
        Efectos e1 = new Efectos();
        e1.playAbrirMenu();
        Window.TEMA_PRINCIPAL.stop();
        Window.TEMA_MENU.playMenuTheme();
        cargaCreaPartida();
    }//GEN-LAST:event_btNuevaPartidaActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        Efectos e1 = new Efectos();
        e1.playSalir();
        int value = JOptionPane.showConfirmDialog(this, "¿Desea salir?", "salir", JOptionPane.YES_NO_OPTION , JOptionPane.WARNING_MESSAGE);
        if(value == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btSalirActionPerformed

    private void btCargarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCargarPartidaActionPerformed
        // TODO add your handling code here:
        Efectos e1 = new Efectos();
        e1.playAbrirMenu();
        Window.TEMA_PRINCIPAL.stop();
        Window.TEMA_MENU.playMenuTheme();
        cargaCargaPartida();
    }//GEN-LAST:event_btCargarPartidaActionPerformed

    private void btMenuOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuOpcionesActionPerformed
        // TODO add your handling code here:
        Efectos e1 = new Efectos();
        e1.playAbrirMenu();
        Window.TEMA_PRINCIPAL.stop();
        Window.TEMA_MENU.playMenuTheme();
        cargaMenuOp();
    }//GEN-LAST:event_btMenuOpcionesActionPerformed

    public void cargaCreaPartida()
    {
        PanelCrearPartida pcp = new PanelCrearPartida();
        pcp.setSize(Window.getJpanel().getWidth(), Window.getJpanel().getHeight());
        pcp.setLocation(0,0);
        
        Window.getJpanel().removeAll();
        Window.getJpanel().add(pcp);
        Window.getJpanel().revalidate();
        Window.getJpanel().repaint();
    }
    
    public void cargaMenuOp()
    {
        PanelMenuOpciones pmi = new PanelMenuOpciones();
        pmi.setSize(Window.getJpanel().getWidth(), Window.getJpanel().getHeight());
        pmi.setLocation(0,0);
        
        Window.getJpanel().removeAll();
        Window.getJpanel().add(pmi);
        Window.getJpanel().revalidate();
        Window.getJpanel().repaint();
    }

    public void cargaCargaPartida()
    {
        PanelCargarPartida pcp = new PanelCargarPartida();
        pcp.setSize(Window.getJpanel().getWidth(), Window.getJpanel().getHeight());
        pcp.setLocation(0,0);
        
        Window.getJpanel().removeAll();
        Window.getJpanel().add(pcp);
        Window.getJpanel().revalidate();
        Window.getJpanel().repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btCargarPartida;
    private javax.swing.JButton btMenuOpciones;
    private javax.swing.JButton btNuevaPartida;
    private javax.swing.JButton btSalir;
    // End of variables declaration//GEN-END:variables
}
