
package GUI2;

import GUI.PantallaJuego;

/**
 *
 * @author HP
 */
public class PanelTutorial extends javax.swing.JPanel {

    public PanelTutorial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSiguiente = new javax.swing.JButton();
        backgorund = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btSiguiente.png"))); // NOI18N
        btSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSiguienteActionPerformed(evt);
            }
        });
        add(btSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 150, 40));

        backgorund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tutorial.png"))); // NOI18N
        add(backgorund, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSiguienteActionPerformed
        PantallaJuego pj =  new PantallaJuego();
        pj.setVisible(true);
        pj.dispose();
        
        cargaJuego();
    }//GEN-LAST:event_btSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgorund;
    private javax.swing.JButton btSiguiente;
    // End of variables declaration//GEN-END:variables

    
    /*public void cargaJuego()
    {
        PanelJuegoV2 pj = new PanelJuegoV2();
        pj.setSize(Window.getJpanel().getWidth(), Window.getJpanel().getHeight());
        pj.setLocation(0,0);
        
        Window.getJpanel().removeAll();
        Window.getJpanel().add(pj);
        Window.getJpanel().revalidate();
        Window.getJpanel().repaint();

    }*/
    
    public void cargaJuego()
    {
        //Window.jMain.removeAll();
        //Window.jMain.revalidate();
        //Window.jMain.repaint();
        Window.cargaJuego().setVisible(true);
    }
}
