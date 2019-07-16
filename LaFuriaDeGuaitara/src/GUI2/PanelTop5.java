/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI2;

import GUI2.PanelInicio;
import GUI2.Window;
import GUIsoundManagement.Efectos;

/**
 *
 * @author Diego
 */
public class PanelTop5 extends javax.swing.JPanel {

    /**
     * Creates new form PanelTop5
     */
    public PanelTop5() {
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

        btVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTop5 = new javax.swing.JTable();
        temp1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(42, 22, 79));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btMenuVolver.png"))); // NOI18N
        btVolver.setPreferredSize(new java.awt.Dimension(233, 59));
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });
        add(btVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 150, 40));

        tblTop5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Tiempo Obtenido", "Items"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTop5);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, 100));

        temp1.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        temp1.setForeground(new java.awt.Color(255, 204, 0));
        temp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        temp1.setText("Mejores Puntajes");
        add(temp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 64, 790, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        Efectos e1 = new Efectos();
        e1.playClickCerrar();
        Window.TEMA_MENU.stop();
        cargaPantallaInicio();
    }//GEN-LAST:event_btVolverActionPerformed

    public void cargaPantallaInicio() {
        PanelInicio pcp = new PanelInicio();
        pcp.setSize(Window.getJpanel().getWidth(), Window.getJpanel().getHeight());
        pcp.setLocation(0,0);
        
        Window.getJpanel().removeAll();
        Window.getJpanel().add(pcp);
        Window.getJpanel().revalidate();
        Window.getJpanel().repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTop5;
    private javax.swing.JLabel temp1;
    // End of variables declaration//GEN-END:variables
}