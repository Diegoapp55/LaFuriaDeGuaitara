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
public class MenuJuego extends javax.swing.JFrame {
    int volMusica;
    int volEfectos;
    /**
     * Creates new form MenuJuego
     */
    public MenuJuego() {
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

        Background = new javax.swing.JPanel();
        btInicio = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btVolver = new javax.swing.JButton();
        sliderMusica = new javax.swing.JSlider();
        sliderEfectos = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btMenuInicio.png"))); // NOI18N
        btInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInicioActionPerformed(evt);
            }
        });
        Background.add(btInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 150, 40));

        btSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btMenuSalir.png"))); // NOI18N
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        Background.add(btSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 150, 40));

        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btMenuGuardar.png"))); // NOI18N
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });
        Background.add(btGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 150, 40));

        btVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btMenuVolver.png"))); // NOI18N
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });
        Background.add(btVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 150, 40));

        sliderMusica.setBackground(new java.awt.Color(204, 153, 255));
        sliderMusica.setValue(100);
        sliderMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Background.add(sliderMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        sliderEfectos.setBackground(new java.awt.Color(204, 153, 255));
        sliderEfectos.setValue(100);
        Background.add(sliderEfectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackSecu.png"))); // NOI18N
        Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btInicioActionPerformed

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        // TODO add your handling code here:
        Efectos e1 = new Efectos();
        e1.playQuitarPausa();
        dispose();
    }//GEN-LAST:event_btVolverActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        Efectos e1 = new Efectos();
        e1.playClickCerrar();
        int value = JOptionPane.showConfirmDialog(this, "¿Desea salir?", "salir", JOptionPane.YES_NO_OPTION , JOptionPane.WARNING_MESSAGE);
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
                "guardar", JOptionPane.DEFAULT_OPTION);
        if(value == JOptionPane.OK_OPTION){
            e1.playQuitarPausa();
            dispose();
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btInicio;
    private javax.swing.JButton btSalir;
    private javax.swing.JButton btVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSlider sliderEfectos;
    private javax.swing.JSlider sliderMusica;
    // End of variables declaration//GEN-END:variables
}