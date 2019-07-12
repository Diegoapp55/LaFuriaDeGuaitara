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
 * @author jdoli
 */
public class PanelMenuInicio extends javax.swing.JPanel {

    int volMusica;
    int volEfectos;
    
    public PanelMenuInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        btGuardar = new javax.swing.JButton();
        sliderMusica = new javax.swing.JSlider();
        sliderEfectos = new javax.swing.JSlider();
        btVolver = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btMenuGuardar.png"))); // NOI18N
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });
        add(btGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 150, 40));
        btGuardar.getAccessibleContext().setAccessibleParent(null);

        sliderMusica.setBackground(new java.awt.Color(204, 153, 255));
        sliderMusica.setValue(100);
        sliderMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(sliderMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 310, -1));

        sliderEfectos.setBackground(new java.awt.Color(204, 153, 255));
        sliderEfectos.setValue(100);
        add(sliderEfectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 310, -1));

        btVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btMenuVolver.png"))); // NOI18N
        btVolver.setPreferredSize(new java.awt.Dimension(233, 59));
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });
        add(btVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 150, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackMenuInicio.png"))); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, background, org.jdesktop.beansbinding.ObjectProperty.create(), background, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        // TODO add your handling code here:
        Efectos e1 = new Efectos();
        volMusica = sliderMusica.getValue();
        volEfectos = sliderEfectos.getValue();
        int value = JOptionPane.showConfirmDialog(this, "Los cambios se han guardado", "Guardar", JOptionPane.DEFAULT_OPTION);
        if(value == JOptionPane.OK_OPTION){
            e1.playClickCerrar();
            cargaPantallaInicio();
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        // TODO add your handling code here:
        Efectos e1 = new Efectos();
        e1.playClickCerrar();
        cargaPantallaInicio();
    }//GEN-LAST:event_btVolverActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btVolver;
    private javax.swing.JSlider sliderEfectos;
    private javax.swing.JSlider sliderMusica;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
