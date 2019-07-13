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
public class PanelMenuPausa extends javax.swing.JPanel {
    int volMusica;
    int volEfectos;
    /**
     * Creates new form panelMenuJuego
     */
    public PanelMenuPausa() {
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

        btInicio = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btVolver = new javax.swing.JButton();
        sliderMusica = new javax.swing.JSlider();
        sliderEfectos = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btMenuInicio.png"))); // NOI18N
        btInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInicioActionPerformed(evt);
            }
        });
        add(btInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 150, 40));

        btSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btMenuSalir.png"))); // NOI18N
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        add(btSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 150, 40));

        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btMenuGuardar.png"))); // NOI18N
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });
        add(btGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 150, 40));

        btVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btMenuVolver.png"))); // NOI18N
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });
        add(btVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 150, 40));

        sliderMusica.setBackground(new java.awt.Color(204, 153, 255));
        sliderMusica.setValue(100);
        sliderMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(sliderMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        sliderEfectos.setBackground(new java.awt.Color(204, 153, 255));
        sliderEfectos.setValue(100);
        add(sliderEfectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackPausa.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInicioActionPerformed
        Efectos e1 = new Efectos();
        e1.playClickCerrar();
        int value = JOptionPane.showConfirmDialog(this, "Opción no disponible aún~",
            "No disponible", JOptionPane.DEFAULT_OPTION);
        if(value == JOptionPane.OK_OPTION){
            e1.playQuitarPausa();
            cargaPantallaInicio();
        }
    }//GEN-LAST:event_btInicioActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        Efectos e1 = new Efectos();
        e1.playClickCerrar();
        int value = JOptionPane.showConfirmDialog(this, "¿Desea salir?", "Salir", JOptionPane.YES_NO_OPTION , JOptionPane.WARNING_MESSAGE);
        if(value == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btSalirActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        // TODO add your handling code here:
        Efectos e1 = new Efectos();
        volMusica = sliderMusica.getValue();
        volEfectos = sliderEfectos.getValue();
        int value = JOptionPane.showConfirmDialog(this, "Los cambios se han guardado",
            "Guardar", JOptionPane.DEFAULT_OPTION);
        if(value == JOptionPane.OK_OPTION){
            e1.playQuitarPausa();
            cargaPantallaInicio();
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        // TODO add your handling code here:
        Efectos e1 = new Efectos();
        e1.playQuitarPausa();
        cargaPantallaInicio();
        
    }//GEN-LAST:event_btVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btInicio;
    private javax.swing.JButton btSalir;
    private javax.swing.JButton btVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSlider sliderEfectos;
    private javax.swing.JSlider sliderMusica;
    // End of variables declaration//GEN-END:variables

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
}