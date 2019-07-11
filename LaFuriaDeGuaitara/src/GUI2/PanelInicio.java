/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI2;

import GUIsoundManagement.Efectos;
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
        initComponents();
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
        btOpciones = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btNuevaPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btNuevaPartida.png"))); // NOI18N
        btNuevaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevaPartidaActionPerformed(evt);
            }
        });
        add(btNuevaPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 200, 50));

        btCargarPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btCargarPartida.png"))); // NOI18N
        add(btCargarPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 200, 50));

        btOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btOpciones.png"))); // NOI18N
        btOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOpcionesActionPerformed(evt);
            }
        });
        add(btOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 200, 50));

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
        e1.playClickPositivo();
        CrearPartida cp1 =  new CrearPartida();
        cp1.setVisible(true);
    }//GEN-LAST:event_btNuevaPartidaActionPerformed

    private void btOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpcionesActionPerformed
        // TODO add your handling code here:
        Efectos e1 = new Efectos();
        e1.playAbrirMenu();
        MenuJuego mj = new MenuJuego();
        mj.setVisible(true);
    }//GEN-LAST:event_btOpcionesActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        Efectos e1 = new Efectos();
        e1.playClickCerrar();
        int value = JOptionPane.showConfirmDialog(this, "¿Desea salir?", "salir", JOptionPane.YES_NO_OPTION , JOptionPane.WARNING_MESSAGE);
        if(value == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btCargarPartida;
    private javax.swing.JButton btNuevaPartida;
    private javax.swing.JButton btOpciones;
    private javax.swing.JButton btSalir;
    // End of variables declaration//GEN-END:variables
}